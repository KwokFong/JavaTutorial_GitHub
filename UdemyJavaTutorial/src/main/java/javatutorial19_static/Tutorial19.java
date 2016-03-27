package javatutorial19_static;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 23: Static
 */

class Thing {
	
	public static final int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing(){
		
		id = count;
		count++;
	}
	
	public void showName(){
		System.out.println("Object id: " + id + "; name: " + name + "; description: " + description);
	}
	
	public static void showInfo(){
		System.out.println(description);
	}
	
}



public class Tutorial19 {
	public static void main(String[] args){
		
		Thing.description = "I am a thing";
//		System.out.println(Thing.description);
		Thing.showInfo();
		
		System.out.println("count: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		System.out.println("count: " + Thing.count);
	}
}

