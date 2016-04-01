package javatutorial36_runtimeexceptions;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 36: Runtime Exceptions
 */

public class Tutorial36 {

	public static void main(String[] args) {
		
		// ArithmeticException
//		int value = 7;
//		value = value/0;
		
		// NullPointerException
//		String text = null;
//		System.out.println(text.length());
		
		// ArrayIndexOutOfBoundsException
//		String[] texts = {"one", "two", "three"};
//		System.out.println(texts[3]);
		
		
		// Catching RuntimeException
		String[] texts = {"one", "two", "three"};
		try{
			System.out.println(texts[3]);
		}
		catch(RuntimeException e){
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		

	}

}
