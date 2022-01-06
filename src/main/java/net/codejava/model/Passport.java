package net.codejava.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import net.codejava.exceptions.ErrorConstants;

@Data
public class Passport {

	@NotBlank(message = ErrorConstants.PASSPORT_PASSPORTNO_EMPTY)
	private String passportNo;

	@NotBlank(message = ErrorConstants.PASSPORT_CITY_EMPTY)
	private String city;

	@NotBlank(message = ErrorConstants.PASSPORT_EXPIRYDATE_EMPTY)
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
