package com.nmgh.login.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {
	private String userId;
	private String userPwd;
	private String userName;
	private String userNick;
	private String userEmail;
	private String userPhone;
	private int userAge;
	private Date  regDate;
	private Date  modDate;
	
	
}
