package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	private JsonUtils() {
	}

	public static void printAsJson(Object object) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String jsonStr = objectMapper.writeValueAsString(object);
			System.out.println(jsonStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
