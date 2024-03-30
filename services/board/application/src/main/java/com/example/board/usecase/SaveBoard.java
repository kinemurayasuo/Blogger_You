package com.example.board.usecase;

import com.example.board.domain.DomainBoard;


public interface SaveBoard {
    DomainBoard saveBoard(DomainBoard domainBoard);
}
