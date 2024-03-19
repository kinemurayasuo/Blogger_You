package com.example.webadapter.dto;

import lombok.Builder;

public record BoardDeleteDto() {
    @Builder
    public record BoardDeleteResponseDto(
            boolean success
    ) {}
}
