package com.example.globalexceptionhandler;

import com.example.common.support.exception.CustomException;
import com.example.common.support.exception.ErrorCode;
import com.example.common.support.exception.ResponseError;
import com.example.common.utils.time.ServerTime;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandlerApplication {

    private final ServerTime serverTime;

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseError> customException(CustomException exception) {
       exception.getErrorCode();
        ErrorCode errorCode = exception.getErrorCode();
        HttpStatus httpStatus = errorCode.defaultHttpStatus();

        ResponseError responseError = ResponseError.of(exception);

        return new ResponseEntity<>(responseError, httpStatus);
    }

}
