package net.codejava.validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.codejava.helper.AddressHelper;
import net.codejava.model.Address;

@Component
public class AddressValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Address.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Address address = (Address) target;
		if (StringUtils.isNotBlank(address.getPin()) && AddressHelper.validatePin(address.getPin())) {
			errors.rejectValue("pin", "102", new Object[] { "General" }, "Pincode is not valid");
		}
	}
}
