package com.example.board.repository;


import com.example.board.readmodel.ReadModelBoard;
import com.example.board.domain.DomainBoard;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BoardRepository {
    DomainBoard saveBoard(DomainBoard domainBoard);
    Optional<ReadModelBoard> findByBoard(String title);
    List<ReadModelBoard> findAll(Pageable pageable);
    boolean updateBoard(String title, String content);
    boolean deleteBoard(UUID id);
}
