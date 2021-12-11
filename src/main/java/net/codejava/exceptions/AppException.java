package net.codejava.exceptions;

import java.util.List;

public class AppException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Error> errors;

	public AppException(String message) {
		super(message);
	}

	public AppException(String message, List<Error> errors) {
		super(message);
		this.errors = errors;
	}

	public AppException(List<Error> errors) {
		this.errors = errors;
	}

	public String getMessage() {
		return super.getMessage();
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

}
