package com.example.store.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.store.exception.dto.ResourceNotFoundException;

@RestControllerAdvice
public class GlobalHandlerExceptionController {

	@ResponseBody
	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<ErrorResponse> handleGeneralException(final Exception exception) {

		var error = new ErrorResponse();
		error.setTitle(exception.getClass().getName());
		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.name());
		error.setDetails(exception.getMessage());

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
	}

	@ResponseBody
	@ExceptionHandler(value = { ResourceNotFoundException.class })
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(final ResourceNotFoundException exception) {

		var error = new ErrorResponse();
		error.setTitle(exception.getClass().getName());
		error.setStatus(HttpStatus.BAD_REQUEST.name());
		error.setDetails(exception.getMessage());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}
}
