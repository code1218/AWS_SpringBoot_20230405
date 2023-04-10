package com.web.study.dto.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LecturerRespDto {
	private int id;
	private String name;
	private LocalDate birthDate;
}
