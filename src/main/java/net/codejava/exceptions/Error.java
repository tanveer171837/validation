package net.codejava.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {

	private String errorCategory;

	private String fieldName;

	private String errorCode;

	private String errorDesc;

	/*public Error() {
	}

	public Error(String errorCategory, String fieldName, String errorCode, String errorDesc) {
		this.errorCategory = errorCategory;
		this.fieldName = fieldName;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}*/

	public Error(String errorCategory, String errorCode, String errorDesc) {
		this.errorCategory = errorCategory;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public Error(String errorCategory, String errorDesc) {
		this.errorCategory = errorCategory;
		this.errorDesc = errorDesc;
	}

	/*public String getErrorCategory() {
		return errorCategory;
	}

	public void setErrorCategory(String errorCategory) {
		this.errorCategory = errorCategory;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}*/

}
