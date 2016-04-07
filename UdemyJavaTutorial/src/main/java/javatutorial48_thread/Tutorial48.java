package javatutorial48_thread;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Tutorial48: Thread
 * Either extends Thread class + overrides run() or implements the Runnable interface.
 */

class Runner extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// 1. Extends Thread class
public class Tutorial48 {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		// HAVE to call start().  Call run() here will execute run() method in main thread...
		// The new Runner will starts a new thread that executes the run() method...
		r1.start();  
		
		Runner r2 = new Runner();
		r2.start();
	}


}
