package javatutorial45_serializingarrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person[] people = { new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob") };

		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		// Try with Resources with 2 statements
		try (FileOutputStream fs = new FileOutputStream("test.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs)) {
			os.writeObject(people); // write as Person[] object.

			os.writeObject(peopleList); // write as ArrayList<Person> object.

			os.writeInt(peopleList.size()); // write out how many objects in
											// peopleList
			for (Person person : peopleList) {
				os.writeObject(person);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
