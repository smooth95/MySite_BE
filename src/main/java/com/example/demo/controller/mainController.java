package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.loginDTO.UserDTO;
import com.example.demo.loginMapper.UserMapper;


@RestController
public class mainController {
	
	@Autowired
	UserMapper mapper;
	
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public List<UserDTO> test(@RequestBody Map<String, String> req) {
        System.out.println("main");
        
        System.out.println("req : " + req); 

        List<UserDTO> rtnList = new ArrayList<UserDTO>(); 
        
        
        rtnList = mapper.selectUserInfo();
        
        UserDTO dto = rtnList.get(0);
        System.out.println("rtnMap : " + dto);
        
        
        return rtnList;
    }
}
