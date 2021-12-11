package net.codejava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.request.UserRegistration;
import net.codejava.response.APIResponse;
import net.codejava.validator.UserRegistrationValidator;

@Service
public class UserManagementService {

	@Autowired
	private UserRegistrationValidator userRegistrationValidator;

	public APIResponse registerUser(UserRegistration registerUser) {
		userRegistrationValidator.validateRegisterUser(registerUser);
		APIResponse apiResponse = new APIResponse();
		apiResponse.setMessage("User(s) registration successful");
		return apiResponse;
	}

}
