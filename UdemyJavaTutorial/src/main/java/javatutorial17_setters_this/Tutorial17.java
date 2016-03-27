package javatutorial17_setters_this;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 21: Setters and 'this'
 */

class Frog {
	private String name;
	private int age;

	public void setName(String newName) {
		this.name = newName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Tutorial17 {

	public static void main(String[] args) {
		Frog frog1 = new Frog();

		// frog1.name = "Bertie";
		// frog1.age = 1;

		frog1.setName("Bertie");
		frog1.setAge(1);

		System.out.println(frog1.getName());

	}
}

