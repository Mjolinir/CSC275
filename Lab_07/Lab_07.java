package Lab_07;

import java.util.ArrayList;
import java.util.Scanner;

import Midterm.Plant;

public class Lab_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Entity> myList = new ArrayList<Entity>();
		
		System.out.println("Welcome to the Adventure game");
		System.out.println("Please select a number from the options below");
		System.out.println("");
		
		while(true){
			System.out.println("1: Create an Archer (playable character)");
			System.out.println("2: Create an Swordsman (playable character)");
			System.out.println("3: Create an Ogre (NPC character)");
			System.out.println("4: Display the characters");
			System.out.println("0: Exit the game");

			// Get the user input
			int userChoice = input.nextInt();

			switch(userChoice){
			case 1: 
				addArcher(myList);
				break;
			case 2: 
				addSwordsman(myList);
				break;
			case 3: 
				addOgre(myList);
				break;
			case 4: 
				displayCharacters(myList);
				break;
			case 0: 
				System.out.println("Thank you for playing!");
				System.exit(0);
			default:
				break;
			}
		}
	}
	
	private static void addArcher(ArrayList<Entity> myList) {
		
	}
	
	private static void addSwordsman(ArrayList<Entity> myList) {
		
	}
	
	private static void addOgre(ArrayList<Entity> myList) {
	
    }
	
	private static void displayCharacters(ArrayList<Entity> myList) {
		
	}
}
