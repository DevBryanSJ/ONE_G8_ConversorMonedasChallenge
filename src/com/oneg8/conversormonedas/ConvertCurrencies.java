package com.oneg8.conversormonedas;

import java.net.http.HttpClient;

public class ConvertCurrencies {

    private String apiUrl = "https://v6.exchangerate-api.com/v6/";
    private HttpClient client;

    public ConvertCurrencies() {
        client = HttpClient.newHttpClient();
    }




}
