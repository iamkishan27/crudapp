package com.example.crudapp.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<CustomError> exceptionHander(CustomException e) {
		CustomError errorResponse = new CustomError(e.getCustomErrorCode().getStatus(),
				e.getCustomErrorCode().getMessage(), e.getCustomErrorCode().getErrors());
		return new ResponseEntity<>(errorResponse, e.getCustomErrorCode().getStatus());
	}

}
