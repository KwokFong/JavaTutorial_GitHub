package javatutorial39_trywithresources;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 39: Try with Resources
 */

class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");	
		throw new Exception("oh no!");
	}
	
}

public class Tutorial39 {

	public static void main(String[] args) {
		
		// Try with Resources:
		// Automatically call close() in Temp
		// java 7 only
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			temp.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
