package net.codejava.response;

import lombok.Data;
import net.codejava.exceptions.APIError;

@Data
public class APIResponse extends APIError {

	private String message;

	private Object data;

	/*public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}*/

}
