package javatutorial22_inheritance;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 26: Inheritance
 */

public class Tutorial22 {

	public static void main(String[] args){
		Machine mach1 = new Machine();
		
		mach1.start();
		mach1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.wipeWindShield();
		car1.showInfo();
		car1.stop();
	}
}
