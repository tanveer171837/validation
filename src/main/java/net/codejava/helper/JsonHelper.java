package net.codejava.helper;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonHelper {

	private static final ObjectMapper mapper = new ObjectMapper();

	public static void setJsonPointerValue(ObjectNode node, JsonPointer pointer, JsonNode value) {
		JsonPointer parentPointer = pointer.head();
		JsonNode parentNode = node.at(parentPointer);
		String fieldName = pointer.last().toString().substring(1);

		if (parentNode.isMissingNode() || parentNode.isNull()) {
			parentNode = StringUtils.isNumeric(fieldName) ? mapper.createArrayNode() : mapper.createObjectNode();
			setJsonPointerValue(node, parentPointer, parentNode);
		}

		if (parentNode.isArray()) {
			ArrayNode arrayNode = (ArrayNode) parentNode;
			int index = Integer.valueOf(fieldName);
			for (int i = arrayNode.size(); i <= index; i++) {
				arrayNode.addNull();
			}
			arrayNode.set(index, value);
		} else if (parentNode.isObject()) {
			((ObjectNode) parentNode).set(fieldName, value);
		} else {
			throw new IllegalArgumentException("`" + fieldName + "` can't be set for parent node `" + parentPointer
					+ "` because parent is not a container but " + parentNode.getNodeType().name());
		}
	}
	public static ObjectMapper getMapper() {
		return mapper;
	}
}
