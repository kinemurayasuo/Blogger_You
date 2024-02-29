package com.example.common.properties.time;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

@ConfigurationPropertiesBinding
@ConfigurationProperties(prefix = "app.times")
public record ServerTimeProperties(
        String serverTime
) {
    public ServerTimeProperties{
        if(serverTime == null || "".equals(serverTime)) serverTime = "Asia/Seoul";
    }
}
