package com.example.board.webadapter;

import com.example.board.readmodel.ReadModelBoard;
import com.example.board.webadapter.service.BoardReadProxyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("Board")
public final class BoardReadApi {

    private final BoardReadProxyService boardReadProxyService;

    @GetMapping("/{title}")
    public ReadModelBoard findByBoard(@PathVariable("title") String title) {
        return boardReadProxyService.findByBoard(title);
    }

    @GetMapping
    public List<ReadModelBoard> findByAll(@PageableDefault(size = 10) Pageable pageable) {
        pageable = pageable.previousOrFirst();
        return boardReadProxyService.findByAll(pageable);
    }
}
