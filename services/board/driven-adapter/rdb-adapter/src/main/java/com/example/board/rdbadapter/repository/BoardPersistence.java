package com.example.board.rdbadapter.repository;

import com.example.board.domain.DomainBoard;
import com.example.board.rdbadapter.mapper.BoardEntityMapper;
import com.example.board.repository.BoardRepository;
import com.example.board.rdbadapter.entity.BoardEntity;
import com.example.board.readmodel.ReadModelBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class BoardPersistence implements BoardRepository {

    private final BoardJpaRepository jpaRepository;
    private final BoardEntityMapper entityMapper;


    @Override
    public DomainBoard saveBoard(DomainBoard domainBoard) {
       BoardEntity boardEntity = jpaRepository.save(entityMapper.toEntity(domainBoard));
        return entityMapper.toDomain(boardEntity);
    }

    @Override
    public Optional<ReadModelBoard> findByBoard(String title) {

        // return Optional<BoardEntity> boardEntity = jpaRepository.findByBoard(title);
        return null;
    }

    @Override
    public List<ReadModelBoard> findAll(Pageable pageable) {
        return null;

    }

    @Override
    public boolean updateBoard(String title, String content) {
        return true;
    }

    @Override
    public boolean deleteBoard(UUID id) {
        boolean haveBoard = jpaRepository.existsById(id);
        if(!haveBoard) return false;
        jpaRepository.deleteById(id);
        return true;
    }
}
