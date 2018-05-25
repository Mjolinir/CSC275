package Lab_02;

import java.util.*;

public class Lab_02 {

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		String[][] contactInfo = new String[10][4];
		
		while (true) {
			System.out.println("1: Add a contact.");
			System.out.println("2: Remove a contact.");
			System.out.println("3: List all contacts.");
			System.out.println("0: Exit App");
			System.out.println(" ");
			int userChoice = menu.nextInt();
			switch(userChoice){
			case 1: 
				addContact(contactInfo);
				break;
			case 2: 
				removeContact(contactInfo);
				break;
			case 3: 
				printArray(contactInfo);
				break;
			case 0: 
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}
	}
	
	public static void addContact(String contactInfo[][]) {
		Scanner input = new Scanner(System.in).useDelimiter("\\s");
		System.out.println("Enter <First Name> <Last Name> <Phone Num> <Age>: ");
		for (int row = 0; row < contactInfo.length; row++) {
			if (contactInfo[row][0] == null) {
				for (int col = 0; col < contactInfo[row].length; col++) {
					contactInfo[row][col] = input.next();
				}
				break;
			}
		}
	}
	
	public static void removeContact(String contactInfo[][]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which row do you wish to remove? ");
		printArray(contactInfo);
		int del = input.nextInt();
		for (int col = 0; col < contactInfo[del].length; col++) {
			contactInfo[del][col] = null;
		}
	}
	
	public static void printArray(String[][] tbl) {
        for (int row = 0; row < tbl.length; row++) {
        	System.out.print(row + " ");
            for (int col = 0; col < tbl[row].length; col++) {
                System.out.print("|" + tbl[row][col]);
            }
            System.out.println("|");
        }
        System.out.println(" ");
    }
}
