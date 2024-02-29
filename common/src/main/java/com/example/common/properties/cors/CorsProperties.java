package com.example.common.properties.cors;

import com.example.common.properties.cors.allowed.CorsPropertiesAllowed;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationPropertiesBinding
@ConfigurationProperties(prefix ="app.security.cors")
public record CorsProperties(
        @NestedConfigurationProperty
        CorsPropertiesAllowed allowed,

        String[] handlers
) {
    public CorsProperties {
        if(allowed == null) allowed = new CorsPropertiesAllowed(null,null,null);
        if(handlers == null || handlers.length == 0) handlers = new String[] {"*"};
    }
}
