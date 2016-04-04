package javatutorial47_passingbyvalue;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 47: Passing By Value
 * Think of reference as a piece of paper with an address on it.
 */

public class App47 {

	public static void main(String[] args) {
		App47 app = new App47();
		int value = 7;

		// ======================
		// app.show(7);

		System.out.println("1. Value in main() is: " + value);
		app.show(value);
		System.out.println("4. Value in main() is: " + value);
		System.out.println();

		// ======================

		Person person = new Person("Bob");
		System.out.println("1. Person in main() is: " + person);
		app.show(person);
		System.out.println("4. Person in main() is: " + person);
		System.out.println();
	}

	public void show(int value) {
		System.out.println("2. Value in show() is: " + value);
		value = 8;
		System.out.println("3. Value in show() is: " + value);
	}

	public void show(Person person) {
		System.out.println("2. Person in show() is: " + person);

		person.setName("Sue");

		person = new Person("Mike");
		// person.setName("Sue");

		System.out.println("3. Person in show() is: " + person);
	}

}
