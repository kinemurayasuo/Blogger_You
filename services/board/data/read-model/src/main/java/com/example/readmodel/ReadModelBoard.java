package com.example.readmodel;

import java.time.Instant;

public record ReadModelBoard(
        String id,
        String userId,
        String title,
        String content,
        Instant boardWriteAt
) {}
