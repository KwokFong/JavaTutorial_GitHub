package javatutorial45_serializingarrays;

import java.io.Serializable;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 45: Serializing Arrays
 */

public class Person implements Serializable {

	private static final long serialVersionUID = -2483690290771841279L;
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
