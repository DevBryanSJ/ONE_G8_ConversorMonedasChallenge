package com.oneg8.conversormonedas;

public record Conversion(
        String result,
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result
) {
}
