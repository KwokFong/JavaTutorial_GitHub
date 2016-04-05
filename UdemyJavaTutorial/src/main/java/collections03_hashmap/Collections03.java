package collections03_hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections03: HashMap
 * - HashMap is not sorted.
 * - If key is a user defined object, have to implements the hashCode() and equals().
 * - item retrieval by key is quick.
 * - no duplicate key
 */

public class Collections03 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");
		map.put(6, "Hello"); // last one wins

		String text = map.get(4);
		String text2 = map.get(1); // returns null if key doesn't exist.
		String text3 = map.get(6);

		System.out.println(text);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println();

		// Gets the Set of all entry objects in the map. Each entry object has a
		// key and a value.
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ": " + value);
		}
		System.out.println();

		for (int key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		System.out.println();
	}
}
