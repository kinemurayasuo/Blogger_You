package com.example.board.rdbadapter.mapper;

import com.example.common.support.mapper.DomainEntityMapper;
import com.example.board.domain.DomainBoard;
import com.example.board.rdbadapter.entity.BoardEntity;
import org.mapstruct.Mapper;

@Mapper
public interface BoardEntityMapper extends DomainEntityMapper<DomainBoard, BoardEntity> {

}
