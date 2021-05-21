package com.example.crudapp.exception;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

public class CustomError {

	private HttpStatus status;
	private String message;
	private List<String> errors;

	public CustomError(HttpStatus status, String message, List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = errors;
	}

	public CustomError(HttpStatus status, String message, String errors) {
		super();
		this.status = status;
		this.message = message;
		this.errors = Arrays.asList(errors);
	}

	public CustomError(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
