package javatutorial38_filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 38: Reading files with FileReader and BufferedReader
 */

public class Tutorial38 {

	public static void main(String[] args) {

		File file = new File("Tutorial38x.txt");
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line;
			
			
			while( (line = br.readLine()) != null){
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to reead file: " + file.toString());
		}
		finally {
			try {
				if (br != null){
					br.close();
				}
			} catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
			} catch (NullPointerException ex){
				// File was probably never opened!; Swallowing the npe.
			}
		}
		

	}

}
