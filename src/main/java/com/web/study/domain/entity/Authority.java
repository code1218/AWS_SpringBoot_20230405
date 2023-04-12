package com.web.study.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Authority {
	private int authority_id;
	private int user_id;
	private int role_id;
	private Role role;
}
