package net.codejava.exceptions;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import net.codejava.response.APIResponse;

@ControllerAdvice
public class APIExceptionHandler {

	@ExceptionHandler(DataValidationException.class)
	public ResponseEntity<APIResponse> handleDataValidationException(DataValidationException ex, WebRequest req) {
		APIResponse apiResponse = new APIResponse();
		apiResponse.setErrorDetail(ex.getMessage());
		apiResponse.setErrors(ex.getErrors());
		apiResponse.setErrorCount(ex.getErrorCount());
		return new ResponseEntity<APIResponse>(apiResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AppException.class)
	public ResponseEntity<APIResponse> handleAPIException(AppException ex, WebRequest req) {
		APIResponse apiResponse = new APIResponse();
		apiResponse.setErrorDetail(ex.getMessage());
		apiResponse.setErrors(ex.getErrors());
		apiResponse.setErrorCount(ex.getErrors().size());
		return new ResponseEntity<APIResponse>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<APIResponse> handleException(Exception ex, WebRequest req) {
		APIResponse apiResponse = new APIResponse();
		apiResponse.setErrorDetail(ExceptionUtils.getRootCauseMessage(ex));
		return new ResponseEntity<APIResponse>(apiResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
