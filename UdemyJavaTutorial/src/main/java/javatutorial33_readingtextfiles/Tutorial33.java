package javatutorial33_readingtextfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 33: Reading Text Files
 */

public class Tutorial33 {

	public static void main(String[] args) throws FileNotFoundException {
//		String filename = "F:/GitHub_kwokfong/JavaTutorial_GitHub/UdemyJavaTutorial/src/main/java/javatutorial33_readingtextfiles/example.txt";
		String filename = "example.txt";  // has to be in the root of Project folder.
		
		File textFile = new File(filename);
		
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		System.out.println("Read value: " + value);
		
		in.nextLine();
		
		int count = 2;
		while(in.hasNextLine()){
			String line = in.nextLine();
			
			System.out.println(count + ": " + line);
			count++;
		}
		
		
		in.close();

	}

}
