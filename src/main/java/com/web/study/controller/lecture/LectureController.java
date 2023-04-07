package com.web.study.controller.lecture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.ResponseDto;

@RestController
public class LectureController {

	// Create
	public ResponseEntity<? extends ResponseDto> register() {
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	// Read
	public ResponseEntity<? extends ResponseDto> get() {
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	// Update
	public ResponseEntity<? extends ResponseDto> modify() {
	
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	// Delete
	public ResponseEntity<? extends ResponseDto> remove() {
	
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
}





