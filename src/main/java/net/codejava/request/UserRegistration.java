package net.codejava.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
import net.codejava.model.User;

@Data
@JsonRootName(value = "userRegistration")
public class UserRegistration {
	
	@NotBlank(message = "Requeter name is required")
	private String requester;
	
	@Valid
	private List<User> users;

	/*public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}*/

}
