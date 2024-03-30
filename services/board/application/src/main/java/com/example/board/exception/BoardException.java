package com.example.board.exception;

import com.example.common.support.exception.CustomException;
import com.example.common.support.exception.ErrorCode;

public class BoardException extends CustomException {
    public BoardException(ErrorCode errorCode) {
        super(errorCode);
    }

    public BoardException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }
}
