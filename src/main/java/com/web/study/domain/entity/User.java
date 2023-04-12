package com.web.study.domain.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.web.study.security.PrincipalDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User{
	
	private int user_id;
	private String username;
	private String password;
	private String name;
	private String email;
	private List<Authority> authorities;
	
	public PrincipalDetails toPrincipal() {
		System.out.println("실행");
		List<String> roles = new ArrayList<>();
		authorities.forEach(authority -> {
			roles.add(authority.getRole().getRole_name());
		});
		
		return PrincipalDetails.builder()
				.userId(user_id)
				.username(username)
				.password(password)
				.roles(roles)
				.build();
	}
}
