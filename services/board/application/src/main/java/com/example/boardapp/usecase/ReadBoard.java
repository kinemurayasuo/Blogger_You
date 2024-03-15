package com.example.boardapp.usecase;

import com.example.domain.DomainBoard;
import com.example.readmodel.ReadModelBoard;

import java.awt.print.Pageable;
import java.util.List;

public interface ReadBoard {
    ReadModelBoard findByBoard(String title);
    List<ReadModelBoard> findAll(Pageable pageable);

}
