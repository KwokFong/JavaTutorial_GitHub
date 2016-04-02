package javatutorial41_innerclasses;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 41: inner classes
 */

public class Tutorial41 {

	public static void main(String[] args) {
		
		Robot robot = new Robot(7);
		robot.start();
		System.out.println();
		
		// For non static inner class.
		// Creating Brain explicitly...
		// Only works if Brain is not defined as private.
//		Robot.Brain brain = robot.new Brain();
//		brain.think();
//		System.out.println();
		
		// For static inner class.
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}
}
