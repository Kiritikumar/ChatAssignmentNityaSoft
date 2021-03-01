package example;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

	public static void main(String[] args) {

		/*
		 * "Write a program to print all elements of a hashmap in following format Key1
		 * = Value1 Key2 = Value2 ...."
		 */

		Map<String, String> hs = new HashMap<>();
		hs.put(null, "this is null");
		hs.put("key1", "value1");
		hs.put("key2", "value2");
		System.out.println(hs);
		for (Map.Entry<String, String> entry : hs.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
