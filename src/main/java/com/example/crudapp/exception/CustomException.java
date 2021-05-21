package com.example.crudapp.exception;

@SuppressWarnings("serial")
public class CustomException extends Exception {

	private final CustomError customError;

	public CustomException(CustomError error) {
		this.customError = error;

	}

	public CustomError getCustomErrorCode() {
		return customError;
	}

}
