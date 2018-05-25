package Assignment_01;

import java.util.*;

public class Assignment01Driver {
	
	public static void main(String[] args){
		new Assignment01Driver ();
	}
	
	// This will act as our program switchboard
	public Assignment01Driver (){
		Scanner input = new Scanner(System.in);
		String[] flowerPack = new String[25];
		
		System.out.println("Welcome to my flower pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");
		
		while(true){
			// Give the user a list of their options
			System.out.println("1: Add an item to the pack.");
			System.out.println("2: Remove an item from the pack.");
			System.out.println("3: Sort the contents of the pack.");
			System.out.println("4: Search for a flower.");
			System.out.println("5: Display the flowers in the pack.");
			System.out.println("0: Exit the flower pack interfact.");
			
			// Get the user input
			int userChoice = input.nextInt();
				
			switch(userChoice){
				case 1: 
					addFlower(flowerPack);
					break;
				case 2: 
					removeFlower(flowerPack);
					break;
				case 3: 
					sortFlowers(flowerPack);
					break;
				case 4: 
					searchFlowers(flowerPack);
					break;
				case 5: 
					displayFlowers(flowerPack);
					break;
				case 0: 
					System.out.println("Thank you for using the flower pack interface. See you again soon!");
					System.exit(0);
			}
		}
	}

	private void addFlower(String flowerPack[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a flower to add: ");
		while (input.hasNext()) {
			for (int i = 0; i < flowerPack.length; i++) {
				if (flowerPack[i] == null) {
					String fwrAdd = input.next();
					flowerPack[i] = fwrAdd.trim();
					break;
				}
				if (i == flowerPack.length - 1) {
					System.out.println("Pack is full");
				}
			}
			break;
		}
	}

	private void removeFlower(String flowerPack[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a flower to remove: ");
		int n = 0;
		while (input.hasNext()) {
			String fwrFind = input.next();
			boolean found = false;
			for (int i = 0; i < flowerPack.length; i++) {
				if (fwrFind.equalsIgnoreCase(flowerPack[i])) {
					found = true;
					n = i;
					break;
				}
			}
			if (found) {
				flowerPack[n] = null;
				System.out.println(fwrFind + " removed at index " + n );
			}
			else {
				System.out.println(fwrFind + " not found");
			}
			break;
		}
	}

	private void sortFlowers(String flowerPack[]) {
		for (int x = 1; x < flowerPack.length - 1 && flowerPack[x] != null; x++) {
	           int minIndex = x - 1;
	           for (int y = x; y < flowerPack.length && flowerPack[y] != null; y++) {
	               if (flowerPack[y].compareTo(flowerPack[minIndex]) < 0) {
	                   minIndex = y;
	               }
	           }
	           String temp = flowerPack[x - 1];
	           flowerPack[x - 1] = flowerPack[minIndex];
	           flowerPack[minIndex] = temp;
	     }
	}

	private void searchFlowers(String flowerPack[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a flower to search for: ");
		int n = 0;
		while (input.hasNext()) {
			String fwrFind = input.next();
			boolean found = false;
			for (int i = 0; i < flowerPack.length; i++) {
				if (fwrFind.equalsIgnoreCase(flowerPack[i])) {
					found = true;
					n = i;
					break;
				}
			}
			if (found) {
				System.out.println(fwrFind + " found at index " + n );
			}
			else {
				System.out.println(fwrFind + " not found");
			}
			break;
		}
	}

	private void displayFlowers(String flowerPack[]) {
		for (int z = 0; z < flowerPack.length; z++) {
			System.out.println(flowerPack[z]);
		}
		System.out.println();
	}
}