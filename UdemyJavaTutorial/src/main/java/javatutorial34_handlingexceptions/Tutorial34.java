package javatutorial34_handlingexceptions;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 34: Handling Exceptions
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tutorial34 {

	public static void main(String[] args) {
		File file = new File("testaaa.txt");

		try {
			FileReader fr = new FileReader(file);
			
			// This will not be executed if an exception is thrown.
			System.out.println("Continuing...");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("File not found: " + file.toString());
		}
		
		System.out.println("Finished...");

	}

}
