package com.example.board.domain;

import lombok.*;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DomainBoard {
    public String id;
    public String userId;
    public String title;
    public String content;
    public Instant boardWriteAt;
}
