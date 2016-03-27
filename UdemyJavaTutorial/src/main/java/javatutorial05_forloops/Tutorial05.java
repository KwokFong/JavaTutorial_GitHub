package javatutorial05_forloops;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 9: For Loops
 */

public class Tutorial05 {
	public static void main(String[] args) {
		
		for(int i=0; i < 5; i++){
//			System.out.println("Hello: " + i);
			System.out.printf("The value of i is: %d\n", i);
		}
		decrementForLoop();
		rangedForLoop();
	}

	private static void rangedForLoop() {
		System.out.println("in rangedForLoop()...");
		for (int i=0; i <= 10; i++) {
			if (i >=5 && i <= 7) System.out.println("The value of i is: " + i);
		}
	}

	private static void decrementForLoop() {
		System.out.println("in decrementForLoop()...");
		for(int i=4; i >= 0; i--){
			System.out.println("Hello: " + i);
		}
	}
	
	
	
	
	
}
