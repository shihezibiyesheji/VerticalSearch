package com.guorunhe.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDemoMapper {

	public int insertDemo(@Param("id") int id) throws SQLException;
}
