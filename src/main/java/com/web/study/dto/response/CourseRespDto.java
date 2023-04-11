package com.web.study.dto.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CourseRespDto {
	private int courseId;
	private LocalDate registeDate;
	private String lectureName;
	private int lecturePrice;
	private String instructorName;
	private String studentName;
}


