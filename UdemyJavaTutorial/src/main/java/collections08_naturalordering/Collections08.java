package collections08_naturalordering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections08: Natural Ordering 
 *   (sort Array, TreeMap, TreeSet with Arbitrary objects) via Comparable interface.
 *   Diff between Comparator vs Comparable
 *   http://www.java2blog.com/2013/02/difference-between-comparator-and.html
 *   https://stackoverflow.com/questions/4108604/java-comparable-vs-comparator
 *   http://www.digizol.com/2008/07/java-sorting-comparator-vs-comparable.html
 *   Use Comparable to define how objects should be 'naturally' sorted.
 *   Use Comparator to sort objects in a different order other than the natural order.
 *   Comparator provides a way to provide custom comparison logic for types that you have no control over the source.
 */

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// hashCode() is used to generate a hash code to be used by TreeSet to figure out where to store the object.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// // equals() is used to check if two objects are exactly equal to each other or not.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	////////////////// Defining Natural Order of Person ///////////////////////
	@Override
	public int compareTo(Person person) {
		// Sort in reverse order of name
//		return -name.compareTo(person.name);  
		
		// Sort by name length
		int len1 = name.length();
		int len2 = person.name.length();
		
		if (len1 > len2){
			return 1;
		}
		else if (len1 < len2){
			return -1;
		}
		else {
			return name.compareTo(person.name);
		}
		
	}
}	// end of Person class.

//////////////////////////////////////////

public class Collections08 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		SortedSet<String> set = new TreeSet<String>();
		
		addElements(list);
		addElements(set);

		// Sort the ArrayList in Natural order
		Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);
	}
	
	private static void addElements(Collection<String> col){
		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
		col.add("Mike");
	}
	
	private static void showElements(Collection<String> col){
		for(String element: col){
			System.out.println(element);
		}
	}	
}
