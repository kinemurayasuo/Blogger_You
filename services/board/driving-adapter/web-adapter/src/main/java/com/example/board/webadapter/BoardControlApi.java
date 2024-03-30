package com.example.board.webadapter;

import com.example.board.webadapter.service.BoardSaveProxyService;
import com.example.board.webadapter.dto.BoardDeleteDto.BoardDeleteResponseDto;
import com.example.board.webadapter.dto.BoardSaveDto.BoardSaveRequestDto;
import com.example.board.webadapter.dto.BoardSaveDto.BoardSaveResponseDto;
import com.example.board.webadapter.dto.BoardUpdateDto.BoardUpdateRequestDto;
import com.example.board.webadapter.dto.BoardUpdateDto.BoardUpdateResponseDto;
import com.example.board.webadapter.service.BoardDeleteProxyService;
import com.example.board.webadapter.service.BoardUpdateProxyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @DeleteMapping("{Id}")
    public BoardDeleteResponseDto deleteBoard(
            @PathVariable UUID Id
    ) {
        return boardDeleteProxyService.boardDelete(Id);
    }

}
