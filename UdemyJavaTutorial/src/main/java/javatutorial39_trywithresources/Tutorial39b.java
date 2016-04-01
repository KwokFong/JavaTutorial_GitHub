package javatutorial39_trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tutorial39b {

	public static void main(String[] args) {
		File file = new File("Tutorial39.txt");
		
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);
		
		// Using Try with Resources on BufferedReader; starts from jdk7 only
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line;
			while( (line = br.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
		

	}

}
