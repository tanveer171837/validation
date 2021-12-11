package net.codejava.helper;

public class PassportHelper {

	public static boolean validatePassportNumber(String passportNo) {
		if ("P1234567".equals(passportNo)) {
			return false;
		}
		return true;
	}
}
