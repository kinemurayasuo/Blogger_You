package com.example.boardapp.repository;

import com.example.domain.DomainBoard;
import com.example.readmodel.ReadModelBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

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
