package net.codejava.helper;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import net.codejava.exceptions.DataValidationException;
import net.codejava.exceptions.Error;
import net.codejava.exceptions.ErrorCodes;

@Component
public class ThrowValidationHelper {

	public void throwValidationException(Errors errors) {
		ObjectMapper mapper = JsonHelper.getMapper();
		ObjectNode rootNode = mapper.createObjectNode();
		int errorCount = 0;
		String errorJson = null;
		try {
			for (FieldError fieldError : errors.getFieldErrors()) {
				JsonHelper.setJsonPointerValue(rootNode,
						JsonPointer.compile("/" + fieldError.getField().replace(".", "/")),
						mapper.valueToTree(String.valueOf(fieldError.getArguments()[0]).equals("General")
								? new Error(String.valueOf(fieldError.getArguments()[0]), fieldError.getCode(),
										fieldError.getDefaultMessage())
								: new Error("appParam", ErrorCodes.valueOf(fieldError.getDefaultMessage()).getCode(),
										ErrorCodes.valueOf(fieldError.getDefaultMessage()).getMessage())));
				++errorCount;
			}
			errorJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
			System.out.println(errorJson);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		throw new DataValidationException("Data Validation Error", errorJson, errorCount);
	}
}
