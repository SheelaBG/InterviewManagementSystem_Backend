package com.java.ims.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ApiError {
	
	private String message;
	private LocalDateTime localdatetime;
	private String endPoint;
	private HttpStatus httpstatus;
}
