package com.web.study.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Lecture {
	private int id;
	private String lecture_name;
	private int lecture_price;
	private int lecturer_id;
}
