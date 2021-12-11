package net.codejava.validator;

import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.codejava.helper.PassportHelper;
import net.codejava.model.Passport;

@Component
public class PassportValidator implements Validator {

	@Autowired
	private MessageSource messageSource;

	@Override
	public boolean supports(Class<?> clazz) {
		return Passport.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Passport passport = (Passport) target;
		if (StringUtils.isNotBlank(passport.getPassportNo())
				&& PassportHelper.validatePassportNumber(passport.getPassportNo())) {
			errors.rejectValue("passportNo", "103", new Object[] { "General" },
					messageSource.getMessage("invalid.passport", new Object[] { passport.getPassportNo() }, null));
		}
		if (StringUtils.isNotBlank(passport.getExpiryDate())
				&& LocalDate.parse(passport.getExpiryDate()).isBefore(LocalDate.now().plusMonths(6))) {
			errors.rejectValue("expiryDate", "104", new Object[] { "General" },
					messageSource.getMessage("invalid.expirydate", new Object[] { 6 }, null));
		}
	}

}
