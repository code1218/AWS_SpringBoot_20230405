package com.web.study.dto.request.course;

import java.time.LocalDate;

import com.web.study.domain.entity.Course;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class CourseReqDto {
	private int lectureId;
	private int studentId;
	private LocalDate registeDate;
	
	public Course toEntity() {
		return Course.builder()
				.lecture_id(lectureId)
				.student_id(studentId)
				.registe_date(registeDate)
				.build();
	}
}
