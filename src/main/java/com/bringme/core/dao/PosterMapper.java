package com.bringme.core.dao;

import com.bringme.core.dto.Poster;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PosterMapper {

    @Select("SELECT * FROM BRINGME.POSTER WHERE id = #{id}")
    Poster findById(@Param("id") String id);
}
