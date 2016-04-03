package javatutorial43_recursion;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 43: Recursion
 * Heap: where objects are allocated; 'new' operator
 * Stack: where local variables are kept; function calls; returned values are kept track.
 */

public class Tutorial43 {

	public static void main(String[] args) {

		// (ie) 4! = 4*3*2*1
		System.out.println(factorial(2));

	}

	private static int factorial(int value) {

		// System.out.println(value);

		if (value == 0) {
			return 1;
		}

		return factorial(value - 1) * value;
	}

}
