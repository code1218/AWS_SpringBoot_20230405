package com.web.study.service;

import com.web.study.dto.request.auth.TokenInfo;
import com.web.study.dto.request.auth.UserRegisteReqDto;

public interface AuthService {
	public TokenInfo login(String username, String password);
	public void registe(UserRegisteReqDto userRegisteReqDto);
}
