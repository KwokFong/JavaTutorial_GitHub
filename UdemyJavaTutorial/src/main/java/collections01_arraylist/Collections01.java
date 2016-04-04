package collections01_arraylist;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections01: ArrayList
 */

import java.util.ArrayList;
import java.util.List;

public class Collections01 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		// Retrieving
		System.out.println(numbers.get(0));
		System.out.println();

		// Indexed for loop iteration
		System.out.println("Iteration #1: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println();

		// Removing items (careful!): #1. to NOT get out of range.
		numbers.remove(numbers.size() - 1);

		// #2. Removing items from beginning or middle of ArrayList is VERY
		// slow. (for large list)
		numbers.remove(0);

		System.out.println("Iteration #2: ");
		for (Integer value : numbers) {
			System.out.println(value);
		}
		System.out.println();

		// List interface ...
		List<String> values = new ArrayList<String>();

	}
}
