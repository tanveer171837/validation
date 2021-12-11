package net.codejava.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import net.codejava.model.User;

@Component
public class UserValidator implements Validator {

	@Autowired
	private BasicInfoValidator basicInfoValidator;

	@Autowired
	private AddressValidator addressValidator;

	@Autowired
	private PassportValidator passportValidator;

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		errors.pushNestedPath("basicInfo");
		ValidationUtils.invokeValidator(basicInfoValidator, user.getBasicInfo(), errors);
		errors.popNestedPath();
		errors.pushNestedPath("address");
		ValidationUtils.invokeValidator(addressValidator, user.getAddress(), errors);
		errors.popNestedPath();
		errors.pushNestedPath("passport");
		ValidationUtils.invokeValidator(passportValidator, user.getPassport(), errors);
		errors.popNestedPath();
	}

}
