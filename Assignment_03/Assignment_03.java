package Assignment_03;

import java.util.*;

public class Assignment_03 {
	public static void main(String[] args) {
		new Assignment_03();
	}

	// This will act as our program switchboard
	public Assignment_03 (){
		Scanner input = new Scanner(System.in);
		ArrayList<Flower> flowerPack = new ArrayList<Flower>();

		System.out.println("Welcome to my flower pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

		while(true){
			// Give the user a list of their options
			System.out.println("1: Add an item to the pack.");
			System.out.println("2: Remove an item from the pack.");
			System.out.println("3: Search for a flower.");
			System.out.println("4: Display the flowers in the pack.");
			System.out.println("0: Exit the flower pack interface.");

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

	private void addFlower(ArrayList<Flower> flowerPack) {
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

		flowerPack.add(newFwr);
	}

	private void removeFlower(ArrayList<Flower> flowerPack) {
		Scanner input = new Scanner(System.in);
		displayFlowers(flowerPack);
		System.out.print("Which flower would you like to remove?: ");
		int remFlower = input.nextInt();
		flowerPack.remove(remFlower -1);
		System.out.println("Flower " + remFlower + " has been removed\n");
	}

	private void searchFlowers(ArrayList<Flower> flowerPack) {
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
				System.out.print("Enter name: ");
				while (input.hasNext()) {
					String fwrFind = input.next().toString();
					for (int i = 0; i < flowerPack.size(); i++) {
						if (flowerPack.get(i).getname().contains(fwrFind)) {
							System.out.println(flowerPack.get(i).getname());
						}
					}
					break;
				}
				break;
			case 2:
				int c = 0;
				System.out.print("Enter color: ");
				while (input.hasNext()) {
					String fwrFind = input.next().toString();
					for (int i = 0; i < flowerPack.size(); i++) {
						if (flowerPack.get(i).getcolor().contains(fwrFind)) {
							System.out.println(flowerPack.get(i).getcolor());
						}
					}
					break;
				}
				break;
			case 3:
				int t = 0;
				System.out.print("has thorns? (Y/N): ");
				while (input.hasNext()) {
					String fwrFind = input.next().toUpperCase().toString();
					for (int i = 0; i < flowerPack.size(); i++) {
						if (flowerPack.get(i).getthorns().contains(fwrFind)) {
							System.out.println(flowerPack.get(i).getname());
						}
					}
					break;
				}
				break;
			case 4:
				int s = 0;
				System.out.print("Enter smell: ");
				while (input.hasNext()) {
					String fwrFind = input.next().toUpperCase().toString();
					for (int i = 0; i < flowerPack.size(); i++) {
						if (flowerPack.get(i).getsmell().contains(fwrFind)) {
							System.out.println(flowerPack.get(i).getsmell());
						}
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

	private void displayFlowers(ArrayList<Flower> flowerPack) {
		for (int z = 0; z < flowerPack.size(); z++) {
			System.out.println("Flower Number: " + (z + 1));
			System.out.println(flowerPack.get(z));
		}
		System.out.println();
	}
}
