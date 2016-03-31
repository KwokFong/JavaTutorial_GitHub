package javatutorial30_generics;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 30: Using Generics
 */

class Animal{
	
}

public class Tutorial30 {

	public static void main(String[] args) {

		//////////////// Before Java 5 ///////////////////
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		//////////////// Modern Style ///////////////////
		System.out.println();
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("aligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		///////////////// There can be more than one type argument ////////////////
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		///////////////// Java 7 Style //////////////////
		ArrayList<Animal> someList = new ArrayList<>();
	}

}
