package javatutorial18_ctor;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 22: Constructor
 */

class Machine{
	
	private String name;
	private int code;
	
	public Machine(){
		this("Arnie", 0);
		System.out.println("Ctor Running...");
	}
	
	public Machine(String name){
		this(name, 0);
		System.out.println("Ctor with param Running...");
//		this.name = name;
	}	
	
	public Machine(String name, int code){
		System.out.println("Ctor with param2 Running...");
		this.name = name;
		this.code = code;
	}		
	
}


public class Tutorial18 {
	public static void main(String[] args){
//		Machine machine1 = new Machine();
//		Machine machine2 = new Machine("Bertie");
		Machine machine3 = new Machine("Chalky", 7);
	}
}

