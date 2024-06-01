package com.thecodea.conversor;

import java.util.HashMap;

public record Moneda(String base_code, HashMap<String, Float> conversion_rates) {
}
