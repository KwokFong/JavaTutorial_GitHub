package collections10_iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections10: Iterators
 * Have to use Iterator when trying to remove item while iterating through a list.
 * Use ListIterator when try to add item while iterating through a list.
 * 
 */

public class Collections10 {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		ListIterator<String> lit = animals.listIterator();
		
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
			
			if(value.equals("cat")){
				it.remove();
			}
		}
		System.out.println();
		
		/// Modern iterations, Java 5+
		// foreach loop uses Iterator behind the scene.
		for (String animal: animals){
			System.out.println(animal);
			
			// Can't do this.
			// Get ConcurrentModificationException; Try to do remove() while trying iterating thru it.
			// animals.remove(2);
		}
		System.out.println();
		
		
		
	}
}
