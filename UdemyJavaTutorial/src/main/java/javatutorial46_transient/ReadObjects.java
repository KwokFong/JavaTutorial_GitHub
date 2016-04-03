package javatutorial46_transient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		// try (FileInputStream fi = new FileInputStream("test.ser")) {
		// ObjectInputStream ois = new ObjectInputStream(fi);

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"))) {

			// When De-serialize object, no constructors are run.
			Person person = (Person) ois.readObject();
			System.out.println(person);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
