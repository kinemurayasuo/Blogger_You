package com.example.board.usecase;

import com.example.board.domain.DomainBoard;

import java.util.UUID;

public interface DeleteBoard {
    boolean deleteBoard(UUID id);
}
