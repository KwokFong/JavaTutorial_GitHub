package collections13_complexdatastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections13: Complex Data Structures
 */

public class Collections13 {

	public static String[] vechicles = { "ambulance", "helicopter", "lifeboat" };

	
	public static String[][] drivers = { 
			{ "Fred", "Sue", "Pete" }, 
			{ "Sue", "Richard", "Bob", "Fred" }, // Don't want duplicates here and maintaining order is important, so use LinkedHashSet.
			{ "Pete", "Mary", "Bob" } 
			};

	public static void main(String[] args) {

		// Data Structure To Be: Map<String, Set>
		// (ie) ambulance/[Fred, Sue, Pete]
		// Order of key/value pair is not important + no need for key to be sorted, so use HashMap.
		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

		// Populate personnel...
		for (int i = 0; i < vechicles.length; i++) {
			String vechicle = vechicles[i];
			String[] driversList = drivers[i];
			
			// Create the Set inside personnel...
			// To populate LinkedHashSet in one go:
//			Set<String> driverSet = new LinkedHashSet<String>(Arrays.asList(driversList));
			Set<String> driverSet = new LinkedHashSet<String>();
			
			for(String driver: driversList){
				driverSet.add(driver);
			}
			
			
			
			// Add entry to the personnel map...
			personnel.put(vechicle, driverSet);
		}
		
		// Example Usage of getting drivers for just'helicopter'...
//		{  // Curly Braces just to scope driversList variable.
//			Set<String> driversList = personnel.get("helicopter");
//			
//			for (String driver: driversList){
//				System.out.println(driver);
//			}
//		}
		
		// Example for iterating through the whole map...
		for (String vechicle: personnel.keySet()){
			System.out.print(vechicle + ": ");
			Set<String> driversList = personnel.get(vechicle);
			
			for (String driver: driversList){
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}
