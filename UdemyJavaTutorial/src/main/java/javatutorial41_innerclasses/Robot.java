package javatutorial41_innerclasses;

//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

public class Robot {

	private int id;

	// 1. Non static inner class; aka Nested Class
	// - For grouping together similar functionalites; Brain, Hand, Leg
	// - Have access to instance variables of enclosing outer class.
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking...");
			System.out.println();
		}
	}

	// 2. static inner class
	// - Wanting a normal class that is NOT tie to instances of enclosing outer class.
	//     and want to group it to the outer class for some reason.
	public static class Battery {
		public void charge() {
			System.out.println("Battery is charing...");
			System.out.println();
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting robot " + id);

		// Have to explicitly create Brain; Not automatically created.
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		// 3. Declaring a local class within method 'start()':
		//    - Have access to instance variable 'id' of outer enclosing class.
		//    - Have access to ONLY final local variable 'name' inside the method.
		//      - see: https://stackoverflow.com/questions/4732544/why-are-only-final-variables-accessible-in-anonymous-class
		//    - Temp inner class in ONLY within scope of start() method.
		class Temp {
			public void doSomething() {
				System.out.println(id);
				System.out.println("My name is: " + name);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}

}
