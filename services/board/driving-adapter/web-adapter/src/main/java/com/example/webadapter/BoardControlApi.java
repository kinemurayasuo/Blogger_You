package com.example.webadapter;

import com.example.webadapter.dto.BoardDeleteDto.BoardDeleteResponseDto;
import com.example.webadapter.dto.BoardSaveDto.BoardSaveRequestDto;
import com.example.webadapter.dto.BoardSaveDto.BoardSaveResponseDto;
import com.example.webadapter.dto.BoardUpdateDto.BoardUpdateRequestDto;
import com.example.webadapter.dto.BoardUpdateDto.BoardUpdateResponseDto;
import com.example.webadapter.service.BoardDeleteProxyService;
import com.example.webadapter.service.BoardReadProxyService;
import com.example.webadapter.service.BoardSaveProxyService;
import com.example.webadapter.service.BoardUpdateProxyService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("board")
public final class BoardControlApi {

    private final BoardSaveProxyService boardSaveProxyService;
    private final BoardUpdateProxyService boardUpdateProxyService;
    private final BoardDeleteProxyService boardDeleteProxyService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BoardSaveResponseDto saveBoard(@RequestBody BoardSaveRequestDto body) {
        return boardSaveProxyService.boardSave(body);
    }

    @PutMapping("{userId}/boardUpdate")
    public BoardUpdateResponseDto updateBoard(
            @PathVariable String userId,
            @RequestBody BoardUpdateRequestDto body
            ) {
        return boardUpdateProxyService.boardUpdate(userId, body.title(), body.content());
    }

    @DeleteMapping("{userId}")
    public BoardDeleteResponseDto deleteBoard(
            @PathVariable String userId
    ) {
        return boardDeleteProxyService.boardDelete(userId);
    }

}
