package com.example.properties.cors.allowed;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

@ConfigurationPropertiesBinding
public record CorsPropertiesAllowed(
        String[] header,
        String[] methods,
        String[] origins
) {
    public CorsPropertiesAllowed {
        if (origins == null || origins.length == 0) origins = new String[] {};
        if (header == null || header.length == 0) header = new String[] {};
        if (methods == null || methods.length == 0) methods = new String[] {};

    }
}
