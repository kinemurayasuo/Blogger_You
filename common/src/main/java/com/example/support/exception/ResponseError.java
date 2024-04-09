package com.example.support.exception;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ResponseError(
     String code,
     Integer status,
     String name,
     String message,
     LocalDateTime localDateTime
) {
    public ResponseError {
        if(code == null) code = "API_Error";
        if(status == null) status = 500;
        if(name == null) name = "API ERROR";
        if("".equals(message) || message == null) message = "API 사용 중 서버 오류 발생";
        if(localDateTime == null) localDateTime = LocalDateTime.now();
    }

    public static ResponseError of(CustomException exception) {
        return of(exception.ERROR_CODE, exception.getMessage());
    }

    private static ResponseError of(ErrorCode errorCode, String message) {
        String errorName = errorCode.defaultException().getClass().getName();
        errorName = errorName.substring(errorName.lastIndexOf('.') + 1);

        return ResponseError.builder()
                .code(errorCode.name())
                .status(errorCode.defaultHttpStatus().value())
                .name(errorName)
                .message(message)
                .build();

    }
}
