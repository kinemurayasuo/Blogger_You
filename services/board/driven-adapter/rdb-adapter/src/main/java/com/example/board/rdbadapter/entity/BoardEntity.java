package com.example.board.rdbadapter.entity;

import com.eelloo.support.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@Data
@Table(name = "board")
public class BoardEntity extends BaseEntity {
    public String userId;
    public String title;
    public String content;
    @Builder.Default
    public Instant boardWriteAt = Instant.now();
}
