package com.web.study.domain.entity;

import java.time.LocalDate;

import com.web.study.dto.response.LecturerRespDto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Lecturer {
	private int id;
	private String name;
	private LocalDate birth_date;
	
	public LecturerRespDto toDto() {
		return LecturerRespDto.builder()
				.id(id)
				.name(name)
				.birthDate(birth_date)
				.build();
	}
}







