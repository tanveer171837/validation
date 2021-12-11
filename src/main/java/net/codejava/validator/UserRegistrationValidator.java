package net.codejava.validator;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Validator;

import net.codejava.helper.ThrowValidationHelper;
import net.codejava.request.UserRegistration;

@Component
public class UserRegistrationValidator {

	@Autowired
	private UserValidator userValidator;

	@Autowired
	private ThrowValidationHelper helper;
	
	@Autowired
	private Validator validator;
	
	public void validateRegisterUser(UserRegistration userRegistration) {
		BeanPropertyBindingResult errors = new BeanPropertyBindingResult(userRegistration, "userRegistration");
        validator.validate(userRegistration, errors);
		AtomicInteger index = new AtomicInteger(0);
		userRegistration.getUsers().stream().forEach(user -> {
			errors.pushNestedPath("users[" + index.getAndIncrement() + "]");
			userValidator.validate(user, errors);
			errors.popNestedPath();
		});
		if (errors.hasErrors()) {
			helper.throwValidationException(errors);
		}
	}
}
