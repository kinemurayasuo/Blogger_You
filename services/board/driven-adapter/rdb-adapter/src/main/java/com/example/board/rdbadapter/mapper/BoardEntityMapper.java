package com.example.board.rdbadapter.mapper;

import com.example.support.mapper.DomainEntityMapper;
import com.example.board.domain.DomainBoard;
import com.example.board.rdbadapter.entity.BoardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface BoardEntityMapper extends DomainEntityMapper<DomainBoard, BoardEntity> {
}
