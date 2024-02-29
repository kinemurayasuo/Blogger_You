package com.example.common.utils.time;

import com.example.common.properties.time.ServerTimeProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;

@Component
public class ServerTime {
    public final ZoneId zoneId;
    public ServerTime(ServerTimeProperties properties) {
        zoneId = ZoneId.of(properties.serverTime());
    }
    public OffsetDateTime now() {
        return OffsetDateTime.now(zoneId);
    }
    public LocalDateTime nowLocal() {return now().toLocalDateTime();}

}
