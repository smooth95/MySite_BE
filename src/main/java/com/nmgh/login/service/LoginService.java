package com.nmgh.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmgh.login.dto.UserDTO;
import com.nmgh.login.mapper.LoginMapper;

@Service
public class LoginService {
	@Autowired
	LoginMapper loginMapper;
	
	public String selectUserInfo(String userId) {
		
		return loginMapper.selectUserInfo(userId);
	}
}
