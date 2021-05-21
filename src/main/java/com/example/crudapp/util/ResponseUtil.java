package com.example.crudapp.util;

import static com.example.crudapp.constant.CommonConstants.CODE;
import static com.example.crudapp.constant.CommonConstants.ERROR;
import static com.example.crudapp.constant.CommonConstants.MESSAGE;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

/**
 * @author swachil-patel
 *
 */

public class ResponseUtil {

	private ResponseUtil() {
	}

	public static Map<String, Object> getSuccessResponse(String message, HttpStatus status) {
		Map<String, Object> response = new LinkedHashMap<>();
		response.put(MESSAGE, message);
		response.put(CODE, status);
		return response;
	}

	public static Map<String, Object> getErrorResponse(String errorMessage, HttpStatus status) {
		Map<String, Object> response = new LinkedHashMap<>();
		response.put(ERROR, errorMessage);
		response.put(CODE, status);
		return response;
	}
}
