package com.example.board.webadapter.service;

import com.example.board.usecase.DeleteBoard;
import com.example.board.webadapter.dto.BoardDeleteDto.BoardDeleteResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BoardDeleteProxyService {
    private final DeleteBoard deleteBoard;

    public BoardDeleteResponseDto boardDelete(UUID Id) {
       boolean result = deleteBoard.deleteBoard(Id);
       return BoardDeleteResponseDto.builder()
               .success(result)
               .build();
    }
}
