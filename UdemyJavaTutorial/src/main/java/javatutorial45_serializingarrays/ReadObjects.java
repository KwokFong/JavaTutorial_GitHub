package javatutorial45_serializingarrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try (FileInputStream fi = new FileInputStream("test.ser")) {
			ObjectInputStream ois = new ObjectInputStream(fi);

			// Read as Person[]
			Person[] people = (Person[]) ois.readObject();
			for (Person person : people) {
				System.out.println(person);
			}
			System.out.println();

			// Read as ArrayList<Person>
			@SuppressWarnings("unchecked") // To get rid of Type Erasure where
											// De-serialize
			ArrayList<Person> peopleList = (ArrayList<Person>) ois.readObject();
			for (Person person : peopleList) {
				System.out.println(person);
			}
			System.out.println();

			// Read as Person
			int num = ois.readInt();
			for (int i = 0; i < num; i++) {
				Person person = (Person) ois.readObject();
				System.out.println(person);
			}
			System.out.println();

			ois.close();

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
