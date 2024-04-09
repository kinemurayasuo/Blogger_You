package com.example.board.webadapter.mapper;

import com.example.board.domain.DomainBoard;
import com.example.board.webadapter.dto.BoardSaveDto.BoardSaveRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.Instant;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface BoardDtoMapper {
    @Mapping(target = "title", source = "dto.userId")
    DomainBoard from(BoardSaveRequestDto dto, Instant boardWriteAt);
}
