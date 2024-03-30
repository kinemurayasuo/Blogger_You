package com.example.board.webadapter.service;

import com.example.board.usecase.SaveBoard;
import com.example.board.domain.DomainBoard;
import com.example.board.webadapter.dto.BoardSaveDto.BoardSaveRequestDto;
import com.example.board.webadapter.dto.BoardSaveDto.BoardSaveResponseDto;
import com.example.board.webadapter.mapper.BoardDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class BoardSaveProxyService {
    private final SaveBoard saveBoard;
    private final BoardDtoMapper boardDtoMapper;

    public BoardSaveResponseDto boardSave(BoardSaveRequestDto dto) {
        DomainBoard domainBoard = boardDtoMapper.from(dto, Instant.now());
        saveBoard.saveBoard(domainBoard);
        return BoardSaveResponseDto.builder()
                .success(true)
                .build();
    }
}
