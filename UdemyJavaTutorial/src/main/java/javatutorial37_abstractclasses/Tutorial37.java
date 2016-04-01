package javatutorial37_abstractclasses;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 37: Abstract Classes
 * Use Abstract Class when parent and child class has a strong tie. (is-a relationship)
 * - child class can only extends 1 abstract class.
 * - Abstract class method can have code in them.
 * Use Interface when the Implementating class only has to fulfill the implementation methods.
 * - child class can implements many interfaces.
 * - methods in Interface doesn't have method definition.
 */

public class Tutorial37 {

	public static void main(String[] args) {

		Camera cam1 = new Camera();
		cam1.setId(5);
		
		Car car1 = new Car();
		car1.setId(4);
		
		car1.run();
		

	}

}
