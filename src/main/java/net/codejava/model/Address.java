package net.codejava.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import net.codejava.exceptions.ErrorConstants;

@Data
public class Address {

	@NotBlank(message = ErrorConstants.ADDRESS_CITY_EMPTY)
	private String city;

	@NotBlank(message = ErrorConstants.ADDRESS_PHONE_EMPTY)
	private String phone;

	@NotBlank(message = ErrorConstants.ADDRESS_PIN_EMPTY)
	private String pin;

	/*public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}*/

}
