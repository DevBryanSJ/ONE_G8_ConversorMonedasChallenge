package com.oneg8.conversormonedas;

import java.util.ArrayList;
import java.util.List;

public class SeedCurrencies {

    public List<Currency> getCurrencies() {
        return currencies;
    }

    private List<Currency> currencies = new ArrayList<>();

    public SeedCurrencies() {
        currencies.add(new Currency("MXN"));
        currencies.add(new Currency("ARS"));
        currencies.add(new Currency("BOB"));
        currencies.add(new Currency("BRL"));
        currencies.add(new Currency("CLP"));
        currencies.add(new Currency("COP"));
        currencies.add(new Currency("USD"));
    }

}