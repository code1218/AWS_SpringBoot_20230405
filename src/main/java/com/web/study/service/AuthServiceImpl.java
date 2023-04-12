package com.web.study.service;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Service;

import com.web.study.dto.request.auth.TokenInfo;
import com.web.study.dto.request.auth.UserRegisteReqDto;
import com.web.study.repository.UserRepository;
import com.web.study.security.JwtTokenProvider;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

	private final UserRepository userRepository;
	private final AuthenticationManagerBuilder authenticationManagerBuilder;
	private final JwtTokenProvider jwtTokenProvider;
	
	@Override
	public TokenInfo login(String username, String password) {
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
		Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
		TokenInfo tokenInfo = jwtTokenProvider.generateToken(authentication);
		return tokenInfo;
	}
	
	@Override
	public void registe(UserRegisteReqDto userRegisteReqDto) {
		userRepository.saveUser(userRegisteReqDto.toEntity());
		
	}

}
