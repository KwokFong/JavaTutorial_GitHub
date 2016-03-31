package javatutorial31_genericsandwildcards;

import java.util.ArrayList;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 31: Generics and Wildcards
 */

class Machine {

	@Override
	public String toString() {
		return "I am a machine.";
	}
	
	public void start(){
		System.out.println("Machine is starting.");
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera.";
	}
	
	public void snap(){
		System.out.println("Camera snaps.");
	}
}

public class Tutorial31 {

	public static void main(String[] args) {
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		
		
		
//		showList(list1);
//		showList(list2);
		
//		showList2(list1);
//		showList2(list2);
		
		showList3(list1);
		showList3(list2);

	}

	// ? wild card with Machine as upper bound; Machine or any subclasses of Machine
	public static void showList(ArrayList<? extends Machine> list) {
		for(Machine value: list){
			System.out.println(value);
			value.start();
		}
	}
	
	// ? wild card with either Camera or super type of Camera (which is Machine); lower bound
	// Have to cast as Object.
	public static void showList2(ArrayList<? super Camera> list) {
		for(Object value: list){
			System.out.println(value);
		}
	}
	
	// ? wild card alone
	public static void showList3(ArrayList<?> list) {
		for(Object value: list){
			System.out.println(value);
		}
	}

}
