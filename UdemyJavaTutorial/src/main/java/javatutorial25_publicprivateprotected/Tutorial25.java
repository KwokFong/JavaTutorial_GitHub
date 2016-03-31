package javatutorial25_publicprivateprotected;

/*
 * private --- only within same class
 * public --- from anywhere
 * protected --- same class, subclass, and same package
 * no modifier --- same package only
 */

import javatutorial25_publicprivateprotected_world.Plant;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 29: public, private, protected
 */

public class Tutorial25 {

	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// won't work; plant.type is private
//		System.out.println(plant.type);
		
		// won't work; size is protected but Tutorial25 is not in the same package as Plant.
//		System.out.println(plant.size);
		
		// won't work; Tutorial25 and Plant in different packages; height has package access
//		System.out.println(plant.height);

	}

}
