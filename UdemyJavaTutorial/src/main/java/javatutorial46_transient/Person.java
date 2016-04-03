package javatutorial46_transient;

import java.io.Serializable;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 46: Transient
 */

public class Person implements Serializable {

	private static final long serialVersionUID = 6420256632130910695L;
	private transient int id;
	private String name;

	// De-serialize doesn't work with static field
	private static int count;

	public Person() {
		System.out.println("Default constructor");
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

		System.out.println("Two-argument constructor");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	// @Override
	// public String toString() {
	// return "Person [id=" + id + ", name=" + name + "]";
	// }

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + Person.count;
	}

}
