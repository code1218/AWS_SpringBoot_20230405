package com.web.study.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.web.study.domain.entity.User;
import com.web.study.exception.CustomException;
import com.web.study.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {

	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User userEntity = userRepository.findUserByUsername(username);
		
		if(userEntity == null) {
			throw new CustomException("사용자 정보를 다시 확인해주세요");
		}
		
		return userEntity.toPrincipal();
	}

}




