package com.web.study.dto.request.auth;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LoginReqDto {
	private String username;
	private String password;
}
