package net.codejava.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class BasicInfo {

	@NotBlank(message = "Name is required")
	private String name;

	@NotBlank(message = "Email is required")
	private String email;

	@NotBlank(message = "Mobile is required")
	private String mobile;

	@NotBlank(message = "Aadhaar is required")
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
