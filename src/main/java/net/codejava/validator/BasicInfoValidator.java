package net.codejava.validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.codejava.helper.AadhaarHelper;
import net.codejava.model.BasicInfo;

@Component
public class BasicInfoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return BasicInfo.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		BasicInfo basicInfo = (BasicInfo) target;
		if (StringUtils.isNotBlank(basicInfo.getAadhaar()) && AadhaarHelper.validateAadhaar(basicInfo.getAadhaar())) {
			errors.rejectValue("aadhaar", "101", new Object[] { "General" }, "Aadhaar is not valid");
		}
	}
}
