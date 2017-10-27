package com.williewheeler.weatherreport.controller;

import com.williewheeler.weatherreport.connector.openweathermap.ErrorMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ErrorMessage defaultExceptionHandler(Exception e) {
		LOG.error("{}: {}", e.getClass().getName(), e.getMessage());
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		return errorMessage;
	}
}
