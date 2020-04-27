package bankAccount;

import java.util.Scanner;

public class bankAccount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // to get user input
		int userChoice; // the userChoice is declared as an int
		boolean quit = false; // the default of quitting the app is set to false
		do { // make a do while loop for if the user wants to quit
			System.out.println("\nSelect 1 to deposit money: "); // prints the instructions to the screen
			System.out.println("\nSelect 2 to withdraw money: ");
			System.out.println("\nSelect 3 to check your balance: ");
			System.out.println("\nSelect 0 to exit: ");
			userChoice = in.nextInt(); // gets input from the user as an int
			
			// uses switch case for each user choice and app logic around choice
			switch(userChoice) {
				case 0: // quit the game
					quit = true; // need the boolean of quit to be true here to stop the game
					System.out.println("/nxThank you for using the app!");
					break;
				
				case 1:
					// deposit money logic
					
					break;
					
				case 2:
					// withdraw money logic
						
					break;
					
				case 3:
					// check balance logic 
					
					break;
				
				default: 
					// to catch any errors should never get this due to logic
					System.out.println("/nAn unknown error has occured. Please make a selection between 0-3: ");
					break;
			}
		}
		while(!quit);
			System.out.println("Bye for now!");
	}
}
