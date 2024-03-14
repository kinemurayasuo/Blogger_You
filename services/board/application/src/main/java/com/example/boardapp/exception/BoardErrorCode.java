package com.example.boardapp.exception;

import com.example.common.support.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum BoardErrorCode implements ErrorCode {
    BOARD_NOT_FOUND("게시판을 찾을수 없습니다", HttpStatus.NOT_FOUND),
    DEFAULT("게시판 시스템 오류", HttpStatus.INTERNAL_SERVER_ERROR);

    public final String message;
    public final HttpStatus status;

    @Override
    public HttpStatus defaultHttpStatus() {
        return status;
    }

    @Override
    public String defaultMessage() {
        return message;
    }

    @Override
    public BoardException defaultException() {
        return new BoardException(this);
    }

    @Override
    public BoardException defaultException(Throwable cause) {
        return new BoardException(this,cause);
    }
}
