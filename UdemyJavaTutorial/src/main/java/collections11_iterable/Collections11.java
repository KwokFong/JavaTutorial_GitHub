package collections11_iterable;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections11: Iterable and creating own Iterator.
 * 
 */

public class Collections11 {
	public static void main(String[] args) {
		
		UrlLibrary urlLibrary = new UrlLibrary();
		
		// This is allowed because UrlLibrary implements Iterable.
		// Internally calling UrlLibrary.iterator.next()
		for(String html: urlLibrary){
			System.out.println(html.length());
//			System.out.println(html);
		}
	}

}
