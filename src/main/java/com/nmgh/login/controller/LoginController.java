package com.nmgh.login.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nmgh.common.dto.ReturnDTO;
import com.nmgh.login.dto.UserDTO;
import com.nmgh.login.dto.UserDTO;
import com.nmgh.login.service.LoginService;


@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ReturnDTO<Boolean> loginUserChk(@RequestBody Map<String, String> req) {
    	logger.info("loginUserChk run ::: ");
    	
    	String inputPwd = req.get("pwd");
        String encodePwd = loginService.selectUserInfo(req.get("id"));
        if (encodePwd == null) {
        	return new ReturnDTO<>("error", false, null);
        }
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        Boolean matchYn = encoder.matches(inputPwd, encodePwd);
        
        if (matchYn) {
        	return new ReturnDTO<>("success", matchYn, null); 
        } else {
        	return new ReturnDTO<>("error", matchYn, null); 
        }
    }
}
