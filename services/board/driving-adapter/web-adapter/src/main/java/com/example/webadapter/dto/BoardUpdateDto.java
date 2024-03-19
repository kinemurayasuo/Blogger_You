package com.example.webadapter.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

public record BoardUpdateDto() {

    @Builder
    public record BoardUpdateRequestDto(
            @NotNull
            String title,

            @NotNull
            String content

    ) {}
    @Builder
    public record BoardUpdateResponseDto(
            boolean success
    ) {}
}
