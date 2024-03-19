package com.example.boardapp.usecase;

import com.example.domain.DomainBoard;

public interface UpdateBoard {
    boolean updateBoard(String userId, String title, String content);
}
