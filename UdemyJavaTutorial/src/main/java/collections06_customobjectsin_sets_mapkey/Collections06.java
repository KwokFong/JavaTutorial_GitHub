package collections06_customobjectsin_sets_mapkey;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections06: Custom Objects in Sets or keys in Map
 * - need to implement hashCode() and equals() to avoid duplicates.
 */

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{ID is: " + id + "; name is: " + name + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class Collections06 {

	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		Person p4 = new Person(1, "Sue");
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);
		
		System.out.println("Map...");
		for (Person key: map.keySet()){
			System.out.println(key + " ==> " + map.get(key));
		}
		System.out.println();
		
//		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
//		
//		map.put("one", 1);
//		map.put("two", 2);
//		map.put("three", 3);
//		map.put("one", 1);
		
//		for (String key: map.keySet()){
//			System.out.println(key + ": " + map.get(key));
//		}
//		System.out.println();
		
		//////////////////////
		System.out.println("Set...");
		Set<Person> set = new LinkedHashSet<Person>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
		
		
//		Set<String> set = new LinkedHashSet<String>();
//		
//		set.add("dog");
//		set.add("cat");
//		set.add("mouse");
//		set.add("cat");
//		System.out.println(set);
		
	}
}
