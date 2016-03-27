package javatutorial07_scanner_dowhile_switch;

import java.util.Scanner;

/*
 * udemy: Java Tutorial for Complete Beginners
 * Lecture 11: Getting User Input
 * Lecture 12: Do..While
 * Lecture 13: Switch
 */
public class Tutorial07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter a command:");
//		String command = scanner.nextLine();
//		System.out.println("command entered = " + command + "\n");
//		
//		System.out.println("Enter an int:");
//		int inputInt = scanner.nextInt();
//		System.out.println("int entered = " + inputInt + "\n");
//		
//		System.out.println("Enter a float:");
//		float inputFloat = scanner.nextFloat();
//		System.out.println("float entered = " + inputFloat + "\n");		
		
		
		
//		int number = 0;
//		do {
//			System.out.println("Pick a number:");
//			number = scanner.nextInt();		
//			
//		} while (number != 7);
		
		
		
		System.out.println("Enter a command:");
		String command = scanner.nextLine();		
		switch (command) {
		case "start":
			System.out.println("Starting...\n");
			break;
		case "stop":
			System.out.println("Stoping...\n");
			break;
		default:
			System.out.println("Invalid command...\n");
			break;
		}

	}
}

