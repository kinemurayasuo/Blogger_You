package com.example.webadapter.service;

import com.example.boardapp.usecase.UpdateBoard;
import com.example.webadapter.dto.BoardUpdateDto.BoardUpdateResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardUpdateProxyService {
    private final UpdateBoard updateBoard;

    public BoardUpdateResponseDto boardUpdate(String userId, String title, String content) {
       boolean result = updateBoard.updateBoard(userId, title, content);
       return BoardUpdateResponseDto.builder()
               .success(result)
               .build();
    }
}
