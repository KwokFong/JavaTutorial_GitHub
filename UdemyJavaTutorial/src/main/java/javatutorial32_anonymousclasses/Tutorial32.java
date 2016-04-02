package javatutorial32_anonymousclasses;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 32: Anonymous Classes
 */

class Machine {
	String name = "MachineA";
	public void start(){
		System.out.println("Starting machne...");
	}
}

interface Plant {
	public void grow();
}

public class Tutorial32 {

	public static void main(String[] args) {
		
		// Anon class
		// - new Machine() is actually a subclass of Machine.
		// - For method start(), 
		//   - Have access to non private class instance variable.
		//   - Inner class defined inside start() can ONLY access final local variable.

		Machine machine1 = new Machine() {
			@Override
			public void start() {
				final String name = "Inside start()...";
				System.out.println("Camera snapping ...");
				System.out.println("Machine Name is: " + name);
				
				class Temp {
					public void doSomething(){
						System.out.println("final local variable 'name' is: " + name);
						System.out.println();
					}
				}
				
				Temp temp = new Temp();
				temp.doSomething();
				
			}
		};

		machine1.start();
		
		///////////////////////////////////////
		// Implementing grow() method in interface Plant...
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant growing");
			}
		};
		
		plant1.grow();
	}

}
