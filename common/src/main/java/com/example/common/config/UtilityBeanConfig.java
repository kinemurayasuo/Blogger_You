package com.example.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Base64.Encoder;

@Configuration
public class UtilityBeanConfig {

    @Bean
    public SecureRandom secureRandom() throws NoSuchAlgorithmException {
        // 알고리즘 미 생성시 오류를 NoSuchAlgorithmException 에 던지는 친구
        return SecureRandom.getInstanceStrong();
    }
    @Bean
    public Encoder encoder() {return Base64.getUrlEncoder().withoutPadding();}
}
