package javatutorial42_enums;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 42: Enums
 */

public class Tutorial42 {

	public static void main(String[] args) {
		
		Animal animal = Animal.DOG;
		
		// Can't do new on emum...
//		Animal animal2 = new Animal();
		
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		}
		System.out.println();
		
		System.out.println(Animal.DOG);
		
		// DOG is object of type 'Animal'
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG.toString());
		System.out.println(Animal.DOG instanceof Animal);
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.DOG instanceof Object);
		System.out.println();
		
		System.out.println(Animal.MOUSE.getName());
		// overriding toString method...
		System.out.println(Animal.MOUSE.toString());
		System.out.println(Animal.MOUSE);
		
		// Animal.MOUSE is an object; to return the enumerated constant value 'MOUSE' as a String value, 
		//   call java.lang.Enum.name()
		System.out.println("Enum constant value as a String: " + Animal.MOUSE.name());
		System.out.println();
		
		// Given constant value of 'CAT', use valueOf() to return CAT as enum object.
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}
}
