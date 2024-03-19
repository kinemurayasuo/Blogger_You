package com.example.webadapter.service;

import com.example.boardapp.usecase.DeleteBoard;
import com.example.webadapter.dto.BoardDeleteDto.BoardDeleteResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardDeleteProxyService {
    private final DeleteBoard deleteBoard;

    public BoardDeleteResponseDto boardDelete(String userId) {
       boolean result = deleteBoard.deleteBoard(userId);
       return BoardDeleteResponseDto.builder()
               .success(result)
               .build();
    }
}
