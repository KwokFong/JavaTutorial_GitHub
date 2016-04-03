package javatutorial44_serialization;

import java.io.Serializable;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 44: Serialization: Saving Objects to Files
 */

public class Person implements Serializable {

	// Make sure Serialize and De-serialize use the same serialVersionUID
	private static final long serialVersionUID = 3518315121786353454L;
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
