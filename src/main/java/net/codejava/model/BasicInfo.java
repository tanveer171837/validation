package net.codejava.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import net.codejava.exceptions.ErrorConstants;

@Data
public class BasicInfo {

	@NotBlank(message = ErrorConstants.BASICINFO_NAME_EMPTY)
	private String name;

	@NotBlank(message = ErrorConstants.BASICINFO_EMAIL_EMPTY)
	private String email;

	@NotBlank(message = ErrorConstants.BASICINFO_MOBILE_EMPTY)
	private String mobile;

	@NotBlank(message = ErrorConstants.BASICINFO_AADHAR_EMPTY)
	private String aadhaar;

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}*/

}
