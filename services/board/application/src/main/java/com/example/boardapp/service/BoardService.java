package com.example.boardapp.service;

import com.example.boardapp.exception.BoardErrorCode;
import com.example.boardapp.repository.BoardRepository;
import com.example.boardapp.usecase.DeleteBoard;
import com.example.boardapp.usecase.ReadBoard;
import com.example.boardapp.usecase.SaveBoard;
import com.example.boardapp.usecase.UpdateBoard;
import com.example.domain.DomainBoard;
import com.example.readmodel.ReadModelBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BoardService implements
        DeleteBoard, ReadBoard, SaveBoard, UpdateBoard {

    private final BoardRepository boardRepository;

    @Override
    public boolean deleteBoard(UUID id) {return boardRepository.deleteBoard(id);}
    @Override
    public ReadModelBoard findByBoard(String title) {
        return boardRepository.
                findByBoard(title).orElseThrow(BoardErrorCode.BOARD_NOT_FOUND::defaultException);
    }

    @Override
    public List<ReadModelBoard> findAll(Pageable pageable) {return boardRepository.findAll(pageable);}
    @Override
    public DomainBoard saveBoard(DomainBoard domainBoard) {return boardRepository.saveBoard(domainBoard);}
    @Override
    public boolean updateBoard(String userId, String title, String content) {return boardRepository.updateBoard(title,content);}
}
