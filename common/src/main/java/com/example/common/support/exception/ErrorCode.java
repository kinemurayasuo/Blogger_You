package com.example.common.support.exception;

public interface ErrorCode {
    String name();
    String DefaultMessage();
    HttpStatus defaultHttpStatus();
    RuntimeException defaultException();
    RuntimeException defaultException(Throwable cause);
}
