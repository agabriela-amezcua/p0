
package project;

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.util.Scanner;  // Import the Scanner class

public class P0 {
	
	public static void message() {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	  	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
	  	String formattedDate = myDateObj.format(myFormatObj);

        System.out.println("Hello and welcome to your Feelings Journal");
		System.out.println("We believe it is important to manage your feelings \n");
		System.out.println("Today's date is " + formattedDate );
		System.out.println("How are you feeling? Please choose from the following: ");
		System.out.println("a)sad, b)angry or upset c)scared e)exit");

	}
	
	public static String input() {
		Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
		String input = myScanner.nextLine();  // Read user input
		myScanner.close();
		return input;
	}
	
	public static void choice(String input) {
		
		char expression = input.charAt(0);
		
		switch(expression) {
		  case 'a':
			  System.out.println("I am sorry you are feeling sad. Let's manage your sadness by doing one of the following:"); // code block
			  System.out.println("cry, visit/call a friend, play/sing/dance to your favorite song or write down your feelings");

		    break;
		  case 'b':
			  System.out.println("I am sorry you are feeling angry. Let's manage your anger by doing one of the following:"); // code block
			  System.out.println("punch a pillow, exercise, yell or write your feelings");
		    break;
		  case 'c':
			  System.out.println("I am sorry you are feeling scared. Let's manage your fear by doing one of the following:"); // code block
			  System.out.println("Think about what is making you afraid and feel the fear until it desapears, take a few breaths, \n"
			  		+ "cober yourself with a blanket in fetal position or get a hug from someone");
		    break;
		  case 'e':
			  System.out.println("Thank you. Come back soon");
			  break;
		  default:
			  System.out.println("Wrong entry");
		}
		
	}
	
	public static void main(String[] args) {
		
		String input = null;
		message();
		try {
			input = input();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		choice(input);		
	}

}
