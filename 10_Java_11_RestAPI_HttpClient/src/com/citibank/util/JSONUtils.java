package com.citibank.util;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtils {
	// convert JSON into List of Objects
	public static <T> List<T> convertFromJsonToList(String json, TypeReference<List<T>> var)
			throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, var);
	}

	// convert object into JSON
	public static String convertFromObjectToJson(Object object) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(object);
	}

	// convert JSON into object
	public static <T> T convertFromJsonToObject(String json, Class<T> var)
			throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, var);
	}

}
