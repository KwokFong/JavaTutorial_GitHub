package javatutorial40_equals;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 40: equals vs ==
 */

class Person {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class Tutorial40 {

	public static void main(String[] args) {

		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");

		// == compare two references pointing to the same object.
		// 'equals' compares two objects semantically.
		System.out.println(person1 == person2);
		System.out.println(person1.equals(person2));
		System.out.println();

		Double value1 = 7.2;
		Double value2 = 7.2;

		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
		System.out.println();

		Integer number1 = 6;
		Integer number2 = 6;

		System.out.println(number1 == number2);
		System.out.println(number1.equals(number2));
		System.out.println();

		String text1 = "Hello";
		String text2 = "Helloxxxxx".substring(0, 5);

		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
		System.out.println();

		// print hashcode
		System.out.println(new Object());
		
	}

}
