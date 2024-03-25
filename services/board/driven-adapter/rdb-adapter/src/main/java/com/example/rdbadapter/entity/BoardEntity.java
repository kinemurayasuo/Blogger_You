package com.example.rdbadapter.entity;

import com.eelloo.support.jpa.BaseEntity;
import com.eelloo.support.jpa.UuidBaseEntity;
import com.example.rdbadapter.support.BoardSchemaConstants;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
@Table(
        schema = BoardSchemaConstants.SCHEMA,
        catalog = BoardSchemaConstants.SCHEMA,
        name = BoardSchemaConstants.TB_BOARD
)
public class BoardEntity extends UuidBaseEntity {
    public String userId;
    public String title;
    public String content;
    @Builder.Default
    public Instant boardWriteAt = Instant.now();

}
