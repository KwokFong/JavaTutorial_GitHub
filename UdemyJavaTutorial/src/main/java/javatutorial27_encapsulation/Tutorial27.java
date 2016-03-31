package javatutorial27_encapsulation;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 27: Encapsulation and the API Docs
 */

class Plant{
	// no public access from outside the class
	private String name;
	
	// Constant 
	public static final int ID = 7;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData(){
		String data = "some stuff: " + calculateGrowthForecast();
		return data;
	}
	
	private int calculateGrowthForecast(){
		return 9;
	}
	
}

public class Tutorial27 {

	public static void main(String[] args) {


	}

}
