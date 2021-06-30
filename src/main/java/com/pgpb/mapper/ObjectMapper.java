package com.pgpb.mapper;

import com.pgpb.objects.SourceType;
import com.pgpb.objects.TargetType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ObjectMapper {
    ObjectMapper INSTANCE = Mappers.getMapper(ObjectMapper.class);

    TargetType map(SourceType source);
}
