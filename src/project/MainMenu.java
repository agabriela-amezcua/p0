package project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	
	static Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
	static File myFile = new File("C:\\Users\\gaby\\Desktop\\filename.txt");
    static FileWriter myWriter;

	
	public static void main(String[] args) {
		
		JournalApp MyJournalApp = new JournalApp();
		try {
			myWriter = new FileWriter("C:\\Users\\gaby\\Desktop\\filename.txt", true);
			/*if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println("File already exists.");
			}*/
	    } catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    	}
		
		
		MyJournalApp.introduction(); 
		
		MyJournalApp.firstMenu();
		
		System.out.println("Thank you for visiting us. Hope to see you soon!");
		
			try {
				myWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		myScanner.close();
	}
	
	 
}


