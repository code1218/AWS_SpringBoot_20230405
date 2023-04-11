package com.web.study.domain.entity;

import java.time.LocalDate;

import com.web.study.dto.response.InstructorRespDto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Instructor {
	private int itm_id;
	private String itm_name;
	private LocalDate itm_birth;
	
	public InstructorRespDto toDto() {
		return InstructorRespDto.builder()
				.id(itm_id)
				.name(itm_name)
				.birthDate(itm_birth)
				.build();
	}
}







