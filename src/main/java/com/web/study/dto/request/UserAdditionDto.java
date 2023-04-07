package com.web.study.dto.request;

import lombok.Data;

@Data
public class UserAdditionDto {
	private String username;
	private String password;
	private String name;
	private String email;
}
