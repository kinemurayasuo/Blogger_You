package com.example.globalexceptionhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@RestControllerAdvice
public class GlobalExceptionHandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlobalExceptionHandlerApplication.class, args);
    }

}
