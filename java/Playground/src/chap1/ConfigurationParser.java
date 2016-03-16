package chap1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

public class ConfigurationParser {

	public JSONObject parseJSONObject(Map<String, Object> node) {
		if (node == null)
			return null;
		for(Entry<String, Object> entry : node.entrySet()) {
			if (entry.getValue() instanceof Map) {
				node.put(entry.getKey(), parseJSONObject((Map) entry.getValue()));
			} else {
				if (entry.getValue().getClass().isArray()) {
					node.put(entry.getKey(), parseJSONArray((Object[])entry.getValue()));
				} else {
					node.put(entry.getKey(), entry.getValue());
				}
			}
		}
		return new JSONObject(node);
	}
	
	public JSONArray parseJSONArray(Object[] values) {
		if (values == null)
			return null;
		Object[] newValues = new Object[values.length];
		int i = 0;
		for (Object value: values) {
			if (value instanceof Map) {
				newValues[i] = parseJSONObject((Map) value);
			} else {
				if (value.getClass().isArray()) {
					newValues[i] = parseJSONArray((Object[]) value);
				} else {
					newValues[i] = value;
				}
			}
			i++;
		}
		return new JSONArray(Arrays.asList(newValues));
	}
	
	public JSONObject parseObject(Object node) {
		return null;
	}
	
	
	public String parse(Map<String, Object> configuration) {
		//
		return parseJSONObject(configuration).toString();
	}
}
