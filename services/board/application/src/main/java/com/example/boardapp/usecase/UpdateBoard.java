package com.example.boardapp.usecase;

import com.example.domain.DomainBoard;

public interface UpdateBoard {
    boolean updateBoard(String title, String content);
}
