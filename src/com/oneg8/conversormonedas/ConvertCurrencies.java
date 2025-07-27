package com.oneg8.conversormonedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertCurrencies {

    private String apiUrl = "https://v6.exchangerate-api.com/v6";
    private String apiKey;
    private HttpClient client;
    private ConfigureEnvironment configEnv;

    public ConvertCurrencies() {
        client = HttpClient.newHttpClient();
        configEnv = new ConfigureEnvironment();
        apiKey = configEnv.loadExchangeRateApiKey();
    }

    // ------------------------------------------------
    // Method to convert specific amount from 'X' to 'Y' currency
    // ------------------------------------------------
    public Conversion convertAmountFromTo (double amount, String currencyCode1, String currencyCode2) {
        URI url = URI.create(apiUrl + "/" + apiKey + "/pair/" + currencyCode1 + "/" + currencyCode2 + "/" + amount);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
