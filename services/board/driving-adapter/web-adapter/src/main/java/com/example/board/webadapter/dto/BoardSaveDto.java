package com.example.board.webadapter.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

public record BoardSaveDto() {
    @Builder
    public record BoardSaveRequestDto(
            @NotNull
            String title,
            @NotNull
            String content,
            @NotNull
            String boardName
    ) {}
    @Builder
    public record BoardSaveResponseDto(
            boolean success
    ) {}
}
