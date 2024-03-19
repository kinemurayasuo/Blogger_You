package com.example.rdbadapter.mapper;

import com.example.common.support.mapper.DomainEntityMapper;
import com.example.domain.DomainBoard;
import com.example.rdbadapter.entity.BoardEntity;
import org.mapstruct.Mapper;

@Mapper
public interface BoardEntityMapper extends DomainEntityMapper<DomainBoard, BoardEntity> {
}
