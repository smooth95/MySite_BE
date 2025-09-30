package com.example.demo.loginMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.loginDTO.UserDTO;

@Mapper
public interface UserMapper {
	List<UserDTO> selectUserInfo();
}
