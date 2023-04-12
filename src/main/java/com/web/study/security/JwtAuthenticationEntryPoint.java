package com.web.study.security;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.web.study.domain.entity.User;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {


	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			org.springframework.security.core.AuthenticationException authException)
			throws java.io.IOException, ServletException {
		ObjectMapper mapper = new ObjectMapper();
		String a = mapper.writeValueAsString(new User());
		System.out.println(a);
		PrintWriter writer = response.getWriter();
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        writer.write(a);
	}
}
