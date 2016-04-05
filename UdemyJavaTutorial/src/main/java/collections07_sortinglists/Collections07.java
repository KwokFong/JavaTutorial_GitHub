package collections07_sortinglists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections07: Sorting Lists using Comparators
 */

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}
}	// end of Person class




class StringLengthComparator implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		
		int len1 = o1.length();
		int len2 = o2.length();
		
		// len1 is sorted later than len2
		if (len1 > len2){
			return 1;
		}
		else if (len1 < len2){  // len1 is sorted earlier than len2.
			return -1;
		}
		
		return 0;
	}
}  // end of StringLengthComparator()


class AlphabeticalComparator implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}	// end of AlphabeticalComparator()


class ReverseAlphabeticalComparator implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}	// end of ReverseAlphabeticalComparator()


///////////////////////////////////

public class Collections07 {

	public static void main(String[] args) {
		
		////////////////// Sorting Strings //////////////////
		List<String> animals = new ArrayList<String>();
		
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");

//		Collections.sort(animals); // Natural order sort.
//		Collections.sort(animals, new StringLengthComparator());  // Sort using StringLengthComparator.
//		Collections.sort(animals, new AlphabeticalComparator());	// Sort using natural order
		Collections.sort(animals, new ReverseAlphabeticalComparator());  // Sort using ReverseAlphabeticalComparator.
		
		
		for(String animal: animals){
			System.out.println(animal);
		}
		System.out.println();
		
		
		
		/////////////// Sorting Numbers /////////////////
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		// Sort by Natural order.
//		Collections.sort(numbers);	
		
		// Sort in Reserve Numerical Order
		Collections.sort(numbers, new Comparator<Integer>(){
			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
			
		});
		
		for (Integer number: numbers){
			System.out.println(number);
		}
		System.out.println();
		
		
		
		
		//////////////// Sorting Arbitrary Object ///////////////////
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));
		people.add(new Person(2, "Sue"));
		
		System.out.println("Before Sort...");
		System.out.println(people);
		
		// Sort By Person.id
//		Collections.sort(people, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person p1, Person p2) {
//				
//				if (p1.getId() > p2.getId()){
//					return 1;
//				}
//				else if (p1.getId() < p2.getId()){
//					return -1;
//				}
//				
//				return 0;
//			}
//			
//		});
		
		// Sort By Person.name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});		
		
		System.out.println("After Sort...");
		System.out.println(people);
		
	}  // end of main()
}
