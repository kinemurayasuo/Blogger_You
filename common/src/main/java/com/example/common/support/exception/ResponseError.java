package com.example.common.support.exception;

import java.time.LocalDateTime;

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
}
