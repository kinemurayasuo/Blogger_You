package com.example.boardapp.usecase;

import com.example.domain.DomainBoard;
import com.example.readmodel.ReadModelBoard;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReadBoard {
    ReadModelBoard findByBoard(String title);
    List<ReadModelBoard> findAll(Pageable pageable);

}
