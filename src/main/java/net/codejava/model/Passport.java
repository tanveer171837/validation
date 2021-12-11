package net.codejava.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Passport {

	@NotBlank(message = "Passport number is required")
	private String passportNo;

	@NotBlank(message = "Passport city is required")
	private String city;

	@NotBlank(message = "Passport expiry date is required")
	private String expiryDate;

	/*public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}*/

}
