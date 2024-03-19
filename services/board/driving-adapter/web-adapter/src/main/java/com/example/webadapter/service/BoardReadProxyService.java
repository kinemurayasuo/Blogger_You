package com.example.webadapter.service;

import com.example.boardapp.usecase.ReadBoard;
import com.example.readmodel.ReadModelBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardReadProxyService {
    private final ReadBoard readBoard;

    public ReadModelBoard findByBoard(String title) {return readBoard.findByBoard(title);}
    public List<ReadModelBoard> findByAll(Pageable pageable) {return readBoard.findAll(pageable);}

}
