package com.nmgh.login.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nmgh.login.dto.UserDTO;

@Mapper
public interface LoginMapper {
	String selectUserInfo(String userId);
}
