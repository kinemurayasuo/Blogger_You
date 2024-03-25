package com.example.rdbadapter.mapper;

import com.example.common.support.mapper.DomainEntityMapper;
import com.example.domain.DomainBoard;
import com.example.rdbadapter.entity.BoardEntity;
import com.example.readmodel.ReadModelBoard;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper
public interface BoardEntityMapper extends DomainEntityMapper<DomainBoard, BoardEntity> {

}
