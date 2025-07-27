package com.oneg8.conversormonedas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigureEnvironment {

    public String loadExchangeRateApiKey() {
        Properties props = new Properties();

        try (FileInputStream input = new FileInputStream("src/config.properties")) {
            props.load(input);
            return props.getProperty("EXCHANGE_RATE_API_KEY");
        } catch (IOException e) {
            throw new RuntimeException("No se pudo leer config.properties", e);
        }
    }

}
