package com.web.study.dto.request.instructor;

import java.time.LocalDate;

import com.web.study.domain.entity.Instructor;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class InstructorReqDto {
	private String name;
	private LocalDate birthDate;
	
	public Instructor toEntity() {
		return Instructor.builder()
				.itm_name(name)
				.itm_birth(birthDate)
				.build();
	}
}
