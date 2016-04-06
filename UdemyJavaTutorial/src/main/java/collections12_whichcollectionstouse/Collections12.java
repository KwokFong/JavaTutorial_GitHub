package collections12_whichcollectionstouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections12: Which Collections To Use.
 * ArrayList vs Vector: http://beginnersbook.com/2013/12/difference-between-arraylist-and-vector-in-java/
 */

public class Collections12 {

	public static void main(String[] args) {
		
		/*
		 * Consider:
		 * 1. what you need the collection to do
		 * 2. are you using the fastest collection for your purposes
		 * (think about insertion/deletion, retrieval and traversal
		 */
		
		/////////////////// LISTS /////////////////////////////////
		
		// Store lists of objects
		// Duplicates are allowed
		// Objects remain in order they were added
		// Elements are indexed via an integer
		// (ie) shopping list
		// Checking for particular item in list is slow.  It has to iterate through the entire list.
		// Looking an item up by index is fast.
		// Iterating through lists is relatively fast.
		// Note: you can sort lists if you want to.
		
		// If you only add or remove items at/near end of list, use ArrayList.
		List<String> list1 = new ArrayList<String>();
		
		// Removing or adding items elsewhere in the list?  Use LinkedList
		List<String> list2 = new LinkedList<String>();
		
		/////////////////// SETS ////////////////////////////////
		
		// Only store unique values (no duplicates)
		// Great for removing duplicates
		// Not indexed, unlike lists
		// Very fast to check if a particular object exists
		// Optimized for looking things up quickly.
		// If you want to use user defined objects, must implement hashCode() and equals().
		
		// If Order is unimportant and if it is ok if the order changes, use HashSet. 
		// HashSet is not ordered.
		Set<String> set1 = new HashSet<String>();
		
		// If elements need to be sorted in natural order, use TreeSet.
		// Use Comparable interface to define natural order on user-defined class.
		Set<String> set2 = new TreeSet<String>();
		
		// If elements need to be in order they were added, use LinkedHashSet.
		Set<String> set3 = new LinkedHashSet<String>();
		
		///////////////////// MAPS ////////////////////////////
		
		// Key-value pairs
		// Can't have duplicate keys
		// keys are alot like sets.
		// Like lookup tables
		// Retrieving a value by key is fast.
		// Iterating over keys is relatively fast.
		// Iterating over map values is VERY slow.
		// Maps are not optimized for iteration.
		// If you want to use user defined objects as keys, must implement hashCode() and equals().
		
		// If keys not needed to be in any particular order, (and order can be changed any time) use HashMap.
		Map<String, String> map1 = new HashMap<String, String>();
		
		// If key elements need to be sorted in natural order, use TreeMap.  Must implement Comparable for custom types.
		Map<String, String> map2 = new TreeMap<String, String>();
		
		// If key elements need to be in order they were added, use LinkedHashMap.
		Map<String, String> map3 = new LinkedHashMap<String, String>();
		
		// For Set and Map, there are also SortedSet and SortedMap interfaces.

		
	}
}
