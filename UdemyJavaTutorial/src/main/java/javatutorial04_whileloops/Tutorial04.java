package javatutorial04_whileloops;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 8: While Loops
 */

public class Tutorial04 {
	public static void main(String[] args) {
		
		int value = 0;
		
		boolean loop = value < 20;
		
		while(value < 10){
			System.out.println("Hello " + value);
			
			value = value + 1;
		}
		
		countDownWhileLoop();
		
	}

	private static void countDownWhileLoop() {
		System.out.println("In countDownWhileLoop()");
		
		int value = 9;
		while (value >= 0){
			System.out.println("Hello " + value);
			value = value - 1;
		}
		
	}
}

