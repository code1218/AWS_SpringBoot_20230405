package com.web.study.controller.lecture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.auth.LoginReqDto;
import com.web.study.dto.request.auth.TokenInfo;
import com.web.study.dto.request.auth.UserRegisteReqDto;
import com.web.study.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService authService;

	@PostMapping("/auth/login")
	public ResponseEntity<? extends ResponseDto> login(@RequestBody LoginReqDto loginReqDto) {
		TokenInfo tokenInfo = authService.login(loginReqDto.getUsername(), loginReqDto.getPassword());
		return ResponseEntity.ok().body(DataResponseDto.of(tokenInfo));
	}
	
	@PostMapping("/auth/registe")
	public ResponseEntity<? extends ResponseDto> registe(@RequestBody UserRegisteReqDto userRegisteReqDto) {
		authService.registe(userRegisteReqDto);
		return ResponseEntity.ok().body(DataResponseDto.empty());
	}
}
