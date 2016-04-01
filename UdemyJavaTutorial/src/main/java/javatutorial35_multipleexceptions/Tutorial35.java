package javatutorial35_multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 35: Multiple Exceptions
 */

public class Tutorial35 {

	public static void main(String[] args) {
		Test test = new Test();

		// Option1: Try/Catch
//		try {
//			test.run();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//			System.out.println("Couldn't parese command file.");
//		}
		
		// Option2: Try/MultiCatch
//		try {
//			test.run();
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// Option3: Try/Catch with Exception
//		try {
//			test.run();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// FileNotFoundException is a child class of IOException; it has to be check first.
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
		
	}

}
