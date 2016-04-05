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


public class Collections08b {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		SortedSet<Person> set = new TreeSet<Person>();
		
		addElements(list);
		addElements(set);  // Can't add elements to TreeSet unless element has Natural order defined in Person class.

		// Sort the ArrayList in Natural order
		Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);
	}
	
	private static void addElements(Collection<Person> col){
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
	}
	
	private static void showElements(Collection<Person> col){
		for(Person element: col){
			System.out.println(element);
		}
	}	
}
