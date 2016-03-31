package javatutorial28_castingnumericalvalues;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Lecture 28: Casting Numerical Values
 */

public class Tutorial28 {
	
	public static void main(String[] args){
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);
		
		// Cast long into int
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// No need to cast
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		// Cast float into int
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		// byteValue isn't big enough for 128;
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}
}
