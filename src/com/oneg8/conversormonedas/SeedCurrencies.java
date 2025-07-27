package com.oneg8.conversormonedas;

import java.util.ArrayList;
import java.util.List;

public class SeedCurrencies {

    public List<Currency> currencies = new ArrayList<>();

    public SeedCurrencies() {
        currencies.add(new Currency("MXN", null));
        currencies.add(new Currency("ARS", null));
        currencies.add(new Currency("BOB", null));
        currencies.add(new Currency("BRL", null));
        currencies.add(new Currency("CLP", null));
        currencies.add(new Currency("COP", null));
        currencies.add(new Currency("USD", null));
    }

}