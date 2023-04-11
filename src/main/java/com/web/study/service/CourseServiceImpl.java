package com.web.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.study.domain.entity.Course;
import com.web.study.dto.request.course.CourseReqDto;
import com.web.study.repository.CourseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

	private final CourseRepository courseRepository;

	@Override
	public void registeCourse(CourseReqDto courseReqDto) {
		courseRepository.saveCourse(courseReqDto.toEntity());
	}
	
	@Override
	public List<Course> getCourseAll() {
		return courseRepository.getCourseAll();
	}
}



