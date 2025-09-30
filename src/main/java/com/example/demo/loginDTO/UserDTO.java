package com.example.demo.loginDTO;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;
import lombok.Getter;

@Data
public class UserDTO {
	private int seq;
	private String id;
	private String pwd;
	private String name;
	private String nick;
	private String email;
	private String phone;
	private int age;
	private Date  regDate;
	private Date  modDate;
	
	
}
