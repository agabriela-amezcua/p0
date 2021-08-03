package project;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JournalApp {
			
		static LocalDateTime myDateObj = LocalDateTime.now();
	  	static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	  	static String formattedDate = myDateObj.format(myFormatObj);	 	

	void introduction(){
		
		System.out.println("Hello and welcome to your Feelings Journal");
		System.out.println("We believe it is important to manage your feelings \n");
		System.out.println("Today's date is " + formattedDate );
		System.out.println("What would you like to do? ");
	}
		
		
	void firstMenu() {
		char mainChoice= 'a';
		
		do {
			System.out.println("Choose from the following: Type a) to manage your feelings, b) to write a journal entry or e) to exit");  
			String input = MainMenu.myScanner.nextLine(); 
			mainChoice = input.charAt(0);	
				
			switch(mainChoice) {
				case 'a':
					System.out.println("Wonderful choice!");
					manageFeelings();
					break;
				case 'b':
					System.out.println("Wonderful choice!");
					writeJournal();
					break;
				case 'e':
					 break;
				default:
					System.out.println("Wrong entry. Try again!");
				}
		}
		while (mainChoice != 'e');
	}

	void manageFeelings() {

		System.out.println("How are you feeling right now? Please choose from the following: ");
		System.out.println("a)sad, b)angry or upset c)scared e)exit");
		
		String input2 = MainMenu.myScanner.nextLine();  // Read 
		
		char feelingChoice = input2.charAt(0);
		//while (feelingChoice != 'e') {
		switch(feelingChoice) {
		  case 'a':
			  System.out.println("\nI am sorry you are feeling sad.");  
			  System.out.println("Here are some of the things you can do to manage your sadness:");  
			  System.out.println("a) cry, b)visit/call a friend, d)play/sing/dance to your favorite song or e)write down your feelings.\n ");
			  System.out.println("Would you like to do something else?. ");  
			  break;
		  case 'b':
			  System.out.println("\nI am sorry you are feeling angry.");  
			  System.out.println("Here are some of the things you can do to manage your anger:"); 
			  System.out.println("a) punch a pillow, b) exercise, c) yell or d) write your feelings.\n");
			  System.out.println("Would you like to do something else?. ");  
		    break;
		  case 'c':
			  System.out.println("\nI am sorry you are feeling scared.");  
			  System.out.println("Here are some of the things you can do to manage your fear:");  
			  System.out.println("a) think about what is making you afraid and feel the fear until it disappears, b) take a few breaths, \n"
			  		+ "c) cover yourself with a blanket in the fetal position or d) get a hug from someone.\n ");
			  System.out.println("Would you like to do something else?. ");  
		    break;
		  case 'e':
			  break;
		  default:
			  System.out.println("Wrong entry. Try again!. ");
		}			
	}
	
	 void writeJournal() {
		 	System.out.println("Please take a minute to write anything that comes to your mind. Don't hold back: ");			
			String input3 = MainMenu.myScanner.nextLine();  
			try {
			
			MainMenu.myWriter.write("On " + formattedDate + " you wrote: " + input3 + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Beautiful! Now take a few breaths...\n");
			System.out.println("Your entry has been recorded.");
			System.out.println("On " + formattedDate + " you wrote: " + input3 + "\n");
			System.out.println("Would you like to do something else?. ");  
	}


}
