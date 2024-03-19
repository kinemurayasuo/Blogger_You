package com.example.webadapter.mapper;

import com.example.domain.DomainBoard;
import com.example.webadapter.dto.BoardSaveDto.BoardSaveRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.Instant;

@Mapper
public interface BoardDtoMapper {
    @Mapping(target = "name", source = "dto.boardName")
    DomainBoard from(BoardSaveRequestDto dto, Instant now);
}
