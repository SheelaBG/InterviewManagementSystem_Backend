package com.java.ims.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<?> handleUserNotFoundException(UserNotFoundException exception, HttpServletRequest request) {
        ApiError apiError = new ApiError();
        apiError.setMessage(exception.getMessage());
        apiError.setLocaldatetime(LocalDateTime.now());
        apiError.setEndPoint(request.getRequestURI());
        apiError.setHttpstatus(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(apiError, apiError.getHttpstatus());
    }
	
	@ExceptionHandler(AdminNotFoundException.class)
    public ResponseEntity<?> handleAdminNotFoundException(AdminNotFoundException exception, HttpServletRequest request) {
        ApiError apiError = new ApiError();
        apiError.setMessage(exception.getMessage());
        apiError.setLocaldatetime(LocalDateTime.now());
        apiError.setEndPoint(request.getRequestURI());
        apiError.setHttpstatus(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(apiError, apiError.getHttpstatus());
    }
}
