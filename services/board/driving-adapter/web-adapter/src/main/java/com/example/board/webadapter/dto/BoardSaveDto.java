package com.example.board.webadapter.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

public record BoardSaveDto() {
    @Builder
    public record BoardSaveRequestDto(
            @NotBlank
            String userId,
            @NotBlank
            String title,
            @NotBlank
            String content
    ) {}
    @Builder
    public record BoardSaveResponseDto(
            boolean success
    ) {}
}
