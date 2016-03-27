package javatutorial13_classandobjects;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 17: Classes and Objects
 * Lecture 18: Methods
 * Lecture 19: Getter and return values
 */

class Person {
	// Classes can contain
	// 1. Data (state of the object)
	// - Instance Variables
	// 2. Behavior (Subroutines, Methods)

	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name + " and I am " + age + " years old.");
	}
	
	int calulateYearsToRetirement(){
		int yearsLeft = 65 - age;
		
//		System.out.println("Years left until retirement: " + yearsLeft);
		return yearsLeft;
	}

	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
}

public class Tutorial13 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 37;

		Person person2 = new Person();
		person2.name = "Sarah";
		person2.age = 20;

		System.out.println(person1.name);
		System.out.println(person2.age);

//		person1.speak();
//		person2.speak();
		
		int years = person1.calulateYearsToRetirement();
		System.out.println("Years till retirements " + years);
		
		String name = person1.getName();
		int age = person1.getAge();
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	}

}

