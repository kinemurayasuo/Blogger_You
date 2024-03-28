package com.example.boardapp.usecase;

import com.example.domain.DomainBoard;

import java.util.UUID;

public interface DeleteBoard {
    boolean deleteBoard(UUID id);
}
