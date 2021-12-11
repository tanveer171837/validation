package net.codejava.exceptions;

public class DataValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object errors;

	private Integer errorCount;

	public DataValidationException(String message) {
		super(message);
	}

	public DataValidationException(String message, Object errors) {
		super(message);
		this.errors = errors;
	}

	public DataValidationException(Object errors) {
		this.errors = errors;
	}

	public DataValidationException(String message, Object errors, Integer errorCount) {
		super(message);
		this.errors = errors;
		this.errorCount = errorCount;
	}

	public String getMessage() {
		return super.getMessage();
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

}
