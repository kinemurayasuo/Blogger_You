package com.example.domain;

import lombok.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DomainBoard {
    public String id;
    public String userId;
    public String title;
    public String content;
    public Instant boardWriteAt;
}
