package collections05_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections05: Sets
 * - No duplicate entries
 * - quick to find if a particular item is in the set.
 */

public class Collections05 {

	public static void main(String[] args) {
		
		// HashSet does not retain order.
//		Set<String> set1 = new HashSet<String>();
		
		// LinkedHashSet remembers the order of the added items
//		Set<String> set1 = new LinkedHashSet<String>();
		
		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();
		
		if (set1.isEmpty()){
			System.out.println("Set is empty...");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		// Adding duplicate items is no-op.
		set1.add("mouse");
		
		System.out.println(set1);
		System.out.println();
		
		//////// Iteration ////////////////
		for(String element: set1){
			System.out.println(element);
		}
		System.out.println();
		
		////////////// Does set contains a given item? /////////////////////
		if (set1.contains("aadvark")){
			System.out.println("Contains aarvark");
		}
		
		if (set1.contains("cat")){
			System.out.println("Contains cat");
		}
		System.out.println();
		
		if (! set1.isEmpty()){
			System.out.println("Set is no longer empty...");
		}
		System.out.println();
		
		// set2 contains come common elements with set1, and some new...
		Set<String> set2 = new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");
		
		/////////////// Intersection //////////////////////
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println("set1: " + intersection);
		System.out.println("set2: " + set2);
		
		// Keeping only elements in both set1 and set2.
		intersection.retainAll(set2);
		System.out.println("intersection of set1 and set2: " + intersection);
		System.out.println();
		
		////////////// Difference //////////////////////
		Set<String> difference = new HashSet<String>(set1);
		
		System.out.println("set1: " + difference);
		System.out.println("set2: " + set2);
		
		// Keep only elements in set1 that are not in set2
		difference.removeAll(set2);
		System.out.println("elements in set1 that are not in set2: " + difference);
		System.out.println();
		
	}
}
