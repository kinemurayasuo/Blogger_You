package com.example.rdbadapter.repository;


import com.example.rdbadapter.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BoardJpaRepository extends JpaRepository<BoardEntity, UUID> {

}
