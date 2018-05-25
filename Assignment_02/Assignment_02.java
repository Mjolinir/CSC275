package Assignment_02;

import java.util.*;

import Assignment_02.Flower;

public class Assignment_02 {
	public static void main(String[] args) {
		new Assignment_02();
	}

	// This will act as our program switchboard
	public Assignment_02 (){
		Scanner input = new Scanner(System.in);
		Flower[] flowerPack = new Flower[25];

		System.out.println("Welcome to my flower pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

		while(true){
			// Give the user a list of their options
			System.out.println("1: Add an item to the pack.");
			System.out.println("2: Remove an item from the pack.");
			System.out.println("3: Search for a flower.");
			System.out.println("4: Display the flowers in the pack.");
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
				searchFlowers(flowerPack);
				break;
			case 4: 
				displayFlowers(flowerPack);
				break;
			case 0: 
				System.out.println("Thank you for using the flower pack interface. See you again soon!");
				System.exit(0);
			}
		}
	}

	private void addFlower(Flower flowerPack[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Flower name: ");
		String nm = input.next();
		System.out.print("Flower color: ");
		String cl = input.next();
		System.out.print("Flower has thorns? (Y/N): ");
		String ht = input.next().toUpperCase();
		System.out.print("Flower smell: ");
		String sm = input.next();
		Flower newFwr = new Flower(nm,cl,ht,sm);

		for (int i = 0; i < flowerPack.length; i++) {
			if (flowerPack[i] == null) {
				flowerPack[i] = newFwr;
				break;
			}
			if (i == flowerPack.length - 1) {
				System.out.println("Pack is full");
			}
		}
	}

	private void removeFlower(Flower flowerPack[]) {
		Scanner input = new Scanner(System.in);

		while(true){
			System.out.println("1: Remove by name.");
			System.out.println("2: Remove by color.");
			System.out.println("3: Remove by thorns.");
			System.out.println("4: Remove by smell.");
			System.out.println("0: Main menu");

			int flowerFind = input.nextInt();

			switch(flowerFind){
			case 1:
				int n = 0;
				System.out.print("Enter name: ");
				while (input.hasNext()) {
					String fwrFind = input.next();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getname())) {
							found = true;
							n = i;
							break;
						}
					}
					if (found) {
						flowerPack[n] = null;
						System.out.println(fwrFind + " removed at index " + n );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 2:
				int c = 0;
				System.out.print("Enter color: ");
				while (input.hasNext()) {
					String fwrFind = input.next();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getcolor())) {
							found = true;
							c = i;
							break;
						}
					}
					if (found) {
						flowerPack[c] = null;
						System.out.println(fwrFind + " removed at index " + c );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 3:
				int t = 0;
				System.out.print("Remove thorns? (Y/N): ");
				while (input.hasNext()) {
					String fwrFind = input.next().toUpperCase();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getthorns())) {
							found = true;
							t = i;
							break;
						}
					}
					if (found) {
						flowerPack[t] = null;
						System.out.println(fwrFind + " removed at index " + t );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 4:
				int s = 0;
				System.out.print("Enter smell: ");
				while (input.hasNext()) {
					String fwrFind = input.next();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getsmell())) {
							found = true;
							s = i;
							break;
						}
					}
					if (found) {
						flowerPack[s] = null;
						System.out.println(fwrFind + " removed at index " + s );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 0:
				break;
			}
			break;
		}
	}

	private void searchFlowers(Flower flowerPack[]) {
		Scanner input = new Scanner(System.in);

		while(true){
			System.out.println("1: Search by name.");
			System.out.println("2: Search by color.");
			System.out.println("3: Search by thorns.");
			System.out.println("4: Search by smell.");
			System.out.println("0: Main menu");

			int flowerFind = input.nextInt();

			switch(flowerFind){
			case 1:
				int n = 0;
				System.out.print("Enter name: ");
				while (input.hasNext()) {
					String fwrFind = input.next();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getname())) {
							found = true;
							n = i;
							break;
						}
					}
					if (found) {
						System.out.println(fwrFind + " found at index " + n );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 2:
				int c = 0;
				System.out.print("Enter color: ");
				while (input.hasNext()) {
					String fwrFind = input.next();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getcolor())) {
							found = true;
							c = i;
							break;
						}
					}
					if (found) {
						System.out.println(fwrFind + " found at index " + c );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 3:
				int t = 0;
				System.out.print("has thorns? (Y/N): ");
				while (input.hasNext()) {
					String fwrFind = input.next().toUpperCase();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getthorns())) {
							found = true;
							t = i;
							break;
						}
					}
					if (found) {
						System.out.println(fwrFind + " found at index " + t );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 4:
				int s = 0;
				System.out.print("Enter smell: ");
				while (input.hasNext()) {
					String fwrFind = input.next();
					boolean found = false;
					for (int i = 0; i < flowerPack.length; i++) {
						if (fwrFind.matches(flowerPack[i].getsmell())) {
							found = true;
							s = i;
							break;
						}
					}
					if (found) {
						System.out.println(fwrFind + " found at index " + s );
						System.out.println(" ");
					}
					else {
						System.out.println(fwrFind + " not found");
						System.out.println(" ");
					}
					break;
				}
				break;
			case 0:
				break;
			}
			break;
		}
	}

	private void displayFlowers(Flower flowerPack[]) {
		for (int z = 0; z < flowerPack.length; z++) {
			System.out.println(flowerPack[z]);
		}
		System.out.println();
	}
}
