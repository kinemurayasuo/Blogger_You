package com.example.redis;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.support.collections.RedisProperties;

import static com.example.common.support.ServerConstants.BASE_PACKAGE;

@Configuration
@RequiredArgsConstructor
@ConfigurationPropertiesScan(basePackageClasses = RedisApplication.class)
@EnableRedisRepositories(basePackages = BASE_PACKAGE)
public class RedisApplication {

    private final RedisProperties redisProperties;
    @Bean
    public RedisConnectionFactory redisConnectionFactory(@Value("${spring.profiles.active}") String activeProfile) {
        RedisConfiguration redisConfiguration;

        if ("local".equalsIgnoreCase(activeProfile)) {
            // Standalone:
            redisConfiguration = new RedisStandaloneConfiguration(
                    redisProperties.getHost(),
                    redisProperties.getPort()
            );
        } else {
            // Cluster: (Node 1개여도 클러스터가 될 수 있음. 최소 3개일 때 생성 -> 2개 지우면 1개)
            redisConfiguration = new RedisClusterConfiguration(
                    redisProperties.getCluster().getNodes()
            );
        }

        return new LettuceConnectionFactory(redisConfiguration);
    }

}
