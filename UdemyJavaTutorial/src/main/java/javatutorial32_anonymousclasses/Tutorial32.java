package javatutorial32_anonymousclasses;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 32: Anonymous Classes
 */

class Machine {
	public void start(){
		System.out.println("Starting machne...");
	}
}

interface Plant {
	public void grow();
}

public class Tutorial32 {

	public static void main(String[] args) {
		
		// new Machine() is actually a subclass of Machine.
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera snapping ...");
			}
		};

		machine1.start();
		
		///////////////////////////////////////
		
		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant growing");
			}
		};
		
		plant1.grow();
	}

}
