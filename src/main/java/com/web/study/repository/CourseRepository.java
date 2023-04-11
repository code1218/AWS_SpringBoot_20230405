package com.web.study.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Course;

@Mapper
public interface CourseRepository {
	
	public int saveCourse(Course course);
	public List<Course> getCourseAll();
}
