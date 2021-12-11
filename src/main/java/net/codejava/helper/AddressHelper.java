package net.codejava.helper;

public class AddressHelper {

	public static boolean validatePin(String pin) {
		if ("208021".equals(pin)) {
			return false;
		}
		return true;
	}

}
