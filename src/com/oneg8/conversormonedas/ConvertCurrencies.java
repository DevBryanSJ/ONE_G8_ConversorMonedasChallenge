package com.oneg8.conversormonedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertCurrencies {

    private String apiUrl = "https://v6.exchangerate-api.com/v6/";
    private String apiKey = "315ab42600ce1ceb67588b59";
    private HttpClient client;

    public ConvertCurrencies() {
        client = HttpClient.newHttpClient();
    }

    // ------------------------------------------------
    // Method to convert specific amount from 'X' to 'Y' currency
    // ------------------------------------------------
    public Conversion convertAmountFromTo (String amount, String currencyCode1, String currecyCode2) {
        URI url = URI.create(apiUrl + '/' + apiKey + '/' + currencyCode1 + '/' + currecyCode2 + '/' + amount);

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
