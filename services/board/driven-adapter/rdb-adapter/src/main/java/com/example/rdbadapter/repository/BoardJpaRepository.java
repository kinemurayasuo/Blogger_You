package com.example.rdbadapter.repository;


import com.example.rdbadapter.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
    boolean findByBoard(String title);
}
