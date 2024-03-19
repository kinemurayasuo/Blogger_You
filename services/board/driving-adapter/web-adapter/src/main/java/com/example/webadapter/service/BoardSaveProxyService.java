package com.example.webadapter.service;

import com.example.boardapp.usecase.SaveBoard;
import com.example.domain.DomainBoard;
import com.example.webadapter.dto.BoardSaveDto.BoardSaveRequestDto;
import com.example.webadapter.dto.BoardSaveDto.BoardSaveResponseDto;
import com.example.webadapter.mapper.BoardDtoMapper;
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
