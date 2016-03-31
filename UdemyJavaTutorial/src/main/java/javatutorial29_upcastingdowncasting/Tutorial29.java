package javatutorial29_upcastingdowncasting;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 29: Upcasting and Downcasting.
 */

class Machine{
	public void start(){
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera started.");
	}
	
	public void snap(){
		System.out.println("Photo taken.");
	}
}

public class Tutorial29 {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting from Camera to Machine (Safe in General)
		System.out.println();
		Machine machine2 = camera1;
		machine2.start();

		// Downcasting from Machine to Camera (Unsafe in General)
		System.out.println();
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		// Doesn't work --- runtime error; underlying of machine4 is of type Machine, not Camera.
//		System.out.println();
//		Machine machine4 = new Machine();
//		Camera camera3 = (Camera)machine4;
//		camera3.start();
	}

}
