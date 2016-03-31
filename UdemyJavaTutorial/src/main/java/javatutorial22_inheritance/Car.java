package javatutorial22_inheritance;

public class Car extends Machine{
	
//	public void start(){
//		System.out.println("Car Started...");
//	}
	
	@Override
	public void start() {
		System.out.println("Car Started...");
	}	
	
	public void wipeWindShield(){
		System.out.println("Wiping windshield");
	}

	public void showInfo(){
		// 'name' has package access
		System.out.println("Car Name: " + name);
	}

}
