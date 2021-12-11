package net.codejava.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Address {

	@NotBlank(message = "City is required")
	private String city;

	@NotBlank(message = "Phone number is required")
	private String phone;

	@NotBlank(message = "Pin is required")
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
