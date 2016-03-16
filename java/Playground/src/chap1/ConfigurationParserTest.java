package chap1;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

public class ConfigurationParserTest extends TestCase{

	public void testBasicType() {
		Date date = new Date();
		Map<String, Object> configuration = new HashMap<>();
		configuration.put("integer", 123);
		configuration.put("float", 123.4);
		configuration.put("boolean", true);
		configuration.put("String", "abc");
		configuration.put("date", date);
		
		String expected = "{\"date\":\""+date+"\",\"boolean\":true,\"integer\":123,\"String\":\"abc\",\"float\":123.4}";
		
		String actual = new ConfigurationParser().parse(configuration);
		
		assertEquals("Should convert basic type with no problem", expected, actual);
	}
	
	public void testArrayType() {
		Date date = new Date();
		Map<String, Object> configuration = new HashMap<>();
		configuration.put("integer", 123);
		configuration.put("float", 123.4);
		configuration.put("boolean", true);
		configuration.put("String", "abc");
		configuration.put("date", date);
		configuration.put("array", new Integer[] {1,2,3});
		
		String expected = "{\"date\":\""+date+"\",\"boolean\":true,\"array\":[1,2,3],\"integer\":123,\"String\":\"abc\",\"float\":123.4}";
		
		String actual = new ConfigurationParser().parse(configuration);
		
		assertEquals("Should convert basic array type with no problem", expected, actual);
	}
	
	public void testMap() {
		Date date = new Date();
		Map<String, Object> configuration = new HashMap<>();
		Map<String, Object> subConfiguration = new HashMap<>();
		Map<String, Object> subConfiguration2 = new HashMap<>();
		Map<String, Object> subConfiguration3 = new HashMap<>();
		Map<String, Object> subConfiguration4 = new HashMap<>();
		subConfiguration4.put("key1", "val1");
		subConfiguration4.put("key2", new Date());
		subConfiguration4.put("key3", new Double[]{2.3, 4.5, 5.6});
		subConfiguration4.put("key4", true);
		
		subConfiguration.put("key1", "val1");
		subConfiguration.put("key2", new Date());
		subConfiguration.put("key3", new Double[]{2.3, 4.5, 5.6});
		subConfiguration2.put("k1", new Long[]{1L, 2L, 3L});
		subConfiguration3.put("date_arr_k6", new Date[]{new Date(), new Date(), new Date()});
		subConfiguration3.put("string_arr_k6", new String[]{"abc", "def", "xyz"});
		subConfiguration3.put("string_k6", "some text");
		subConfiguration3.put("map_k6", subConfiguration4);
		subConfiguration3.put("nested_array_k6", new Integer[][]{{1,2,3},{4,5,6}});
		Integer[][][] threeDimArr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		subConfiguration3.put("nested_3d_k6", threeDimArr);
		subConfiguration.put("k4", subConfiguration2);
		List<Map<String, Object>> configs = new ArrayList<Map<String, Object>>();
		configs.add(subConfiguration2);
		configs.add(subConfiguration3);
		subConfiguration.put("k5", configs.toArray());

		configuration.put("integer", 123);
		configuration.put("float", 123.4);
		configuration.put("boolean", true);
		configuration.put("String", "abc");
		configuration.put("date", date);
		configuration.put("array", new Integer[] {1,2,3});
		configuration.put("map", subConfiguration);
		
		String expected = "{\"date\":\""+date+"\",\"boolean\":true,\"array\":[1,2,3],\"integer\":123,\"String\":\"abc\",\"float\":123.4}";
		expected = "{\"date\":\""+date+"\",\"boolean\":true,\"array\":[1,2,3],\"integer\":123,\"String\":\"abc\",\"float\":123.4,\"map\":{\"key1\":\"val1\",\"key2\":\""+date+"\",\"key3\":[2.3,4.5,5.6],\"k4\":{\"k1\":[1,2,3]},\"k5\":[{\"k1\":[1,2,3]},{\"string_arr_k6\":[\"abc\",\"def\",\"xyz\"],\"map_k6\":{\"key1\":\"val1\",\"key2\":\""+date+"\",\"key3\":[2.3,4.5,5.6],\"key4\":true},\"nested_array_k6\":[[1,2,3],[4,5,6]],\"date_arr_k6\":[\""+date+"\",\""+date+"\",\""+date+"\"],\"string_k6\":\"some text\",\"nested_3d_k6\":[[[1,2],[3,4]],[[5,6],[7,8]]]}]}}";                  
		
		String actual = new ConfigurationParser().parse(configuration);
		
		assertEquals("Should convert a complex object with no problem", expected, actual);
	}
}
