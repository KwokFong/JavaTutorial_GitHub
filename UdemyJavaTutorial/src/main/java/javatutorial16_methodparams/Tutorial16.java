package javatutorial16_methodparams;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 20: Method Parameters
 */

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height){
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
	
}

public class Tutorial16 {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi I'm Sam.");
		sam.jump(7);
		sam.move("West", 12.2);
	}
}

