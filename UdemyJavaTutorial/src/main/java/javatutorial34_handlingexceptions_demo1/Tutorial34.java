package javatutorial34_handlingexceptions_demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 34: Handling Exceptions
 */

public class Tutorial34 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("test.txt");

		FileReader fr = new FileReader(file);
	}

}
