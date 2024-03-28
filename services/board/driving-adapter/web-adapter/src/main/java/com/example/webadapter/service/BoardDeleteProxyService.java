package com.example.webadapter.service;

import com.example.boardapp.usecase.DeleteBoard;
import com.example.webadapter.dto.BoardDeleteDto.BoardDeleteResponseDto;
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
