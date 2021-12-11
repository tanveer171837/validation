package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.codejava.request.UserRegistration;
import net.codejava.response.APIResponse;
import net.codejava.service.UserManagementService;

@RestController
@RequestMapping("/usermanagement")
public class UserManagementController {

	@Autowired
	private UserManagementService userMgmtService;

	@PostMapping("/register")
	@ApiOperation(value = "Register User")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error"),
			@ApiResponse(code = 400, message = "Bad Request") })
	public ResponseEntity<APIResponse> registerUser(@RequestBody UserRegistration userRegistration) {
		return ResponseEntity.ok(userMgmtService.registerUser(userRegistration));
	}
}
