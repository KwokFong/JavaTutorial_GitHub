package collections02_linkedlist;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections02: LinkedList
 * - Use ArrayList if only adding and removing items at the end of the list.
 * - Use LinkedList if want to add/remove items anywhere.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections02 {

	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally. [0][1][2][3][4][5] .....
		 * 
		 */
		List<Integer> arrayList = new ArrayList<Integer>();

		/*
		 * LinkedLists consists of elements where each element has a reference
		 * to the previous and next element [0]->[1]->[2] <- <-
		 */
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();

		// Add items at the end of the list
		// for (int i=0; i < 1E5; i++){
		// list.add(i);
		// }

		// Add items at the beginning of the list
		// for (int i = 0; i < 1E5; i++) {
		// list.add(0, i);
		// }

		// Add items near the end of the list
		// for (int i = 0; i < 1E5; i++) {
		// list.add(list.size(), i);
		// }

		// Add items 100 elements BEFORE the end of the list
		for (int i = 0; i < 1E5; i++) {
			list.add(list.size() - 100, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time Taken: " + (end - start) + " ms for " + type);

	}

}
