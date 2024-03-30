package com.example.board.webadapter.dto;

import lombok.Builder;

public record BoardDeleteDto() {
    @Builder
    public record BoardDeleteResponseDto(
            boolean success
    ) {}
}
