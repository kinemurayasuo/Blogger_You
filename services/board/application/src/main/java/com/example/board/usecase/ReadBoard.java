package com.example.board.usecase;

import com.example.board.readmodel.ReadModelBoard;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReadBoard {
    ReadModelBoard findByBoard(String title);
    List<ReadModelBoard> findAll(Pageable pageable);

}
