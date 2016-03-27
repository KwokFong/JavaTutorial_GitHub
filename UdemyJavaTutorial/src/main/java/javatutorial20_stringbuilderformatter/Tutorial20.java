package javatutorial20_stringbuilderformatter;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 24: String Builder and String Formatting
 */

public class Tutorial20 {

	public static void main(String[] args) {
		
		// Inefficient
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a Builder";
		
		System.out.println(info);
		
		// More efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		// Chaining
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydriver.");
		
		System.out.println(s.toString());
		
		// StringBuffer (ThreadSafe)
		
		
		///////Formatting integer/////////////////
		System.out.print("Here is some text.\tThat wwas a tab.\nThat was a newline.");
		System.out.println(" More text");
		
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
		
		for (int i = 0; i < 20; i++){
			System.out.printf("%2d: %s\n", i, "here is some text");
		}
		
		// Formatting floating point value
		System.out.printf("Total value: %.2f\n", 5.6874);
		System.out.printf("Total value: %-6.1f\n", 343.23423);
		
	}

}

