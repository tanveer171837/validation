package net.codejava.helper;

public class AadhaarHelper {

	public static boolean validateAadhaar(String aadhaar) {
		if ("872300001234".equals(aadhaar)) {
			return false;
		}
		return true;
	}

}
