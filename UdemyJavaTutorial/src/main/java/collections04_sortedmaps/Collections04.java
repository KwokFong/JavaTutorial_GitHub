package collections04_sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections04: SortedMaps
 */

public class Collections04 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		// Ordered HashMap; HashMap with doubly linked link connecting the
		// entries
		// key/value is in the order of data entry into the map.
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// Ordered HashMap; Put key in natural order.
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		testMap(hashMap); // order not guarantee.
		testMap(linkedHashMap); // preserve input order
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");

		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + ": " + value);
		}
		System.out.println();
	}
}
