package net.codejava.exceptions;

public enum ErrorCodes {

	BASICINFO_NAME_EMPTY("101", "Name is required"),

	BASICINFO_EMAIL_EMPTY("102", "Email is required"),

	BASICINFO_MOBILE_EMPTY("103", "Mobile is required"),

	BASICINFO_AADHAR_EMPTY("104", "Aadhar is required"),

	ADDRESS_CITY_EMPTY("201", "City is required"),

	ADDRESS_PHONE_EMPTY("202", "Phone is required"),

	ADDRESS_PIN_EMPTY("203", "Pin is required"),

	PASSPORT_PASSPORTNO_EMPTY("301", "Passport number is required"),

	PASSPORT_CITY_EMPTY("302", "City is required"),

	PASSPORT_EXPIRYDATE_EMPTY("303", "Passport expiry date is required");

	private String code;

	private String message;

	private ErrorCodes(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
