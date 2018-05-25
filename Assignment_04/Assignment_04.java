package Assignment_04;

import java.util.*;
import java.io.*;

public class Assignment_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Plant> plantPack = new ArrayList<Plant>();

		System.out.println("Welcome to my plant pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

		while(true){
			// Give the user a list of their options
			System.out.println("1: Add an item to the pack.");
			System.out.println("2: Remove an item from the pack.");
			System.out.println("3: Search for a item.");
			System.out.println("4: Display the items in the pack.");
			System.out.println("5: Save the pack to a file.");
			System.out.println("6: Load the pack from a file.");
			System.out.println("0: Exit the plant pack interface.");

			// Get the user input
			int userChoice = input.nextInt();

			switch(userChoice){
			case 1: 
				addItem(plantPack);
				break;
			case 2: 
				removeItem(plantPack);
				break;
			case 3: 
				searchItem(plantPack);
				break;
			case 4: 
				displayItem(plantPack);
				break;
			case 5: 
				saveFile(plantPack);
				break;
			case 6: 
				loadFile(plantPack);
				break;
			case 0: 
				System.out.println("Thank you for using the plant pack interface. See you again soon!");
				System.exit(0);
			default:
				break;
			}
		}
	}

	private static void addItem(ArrayList<Plant> plantPack) {
		Scanner input = new Scanner(System.in);

		System.out.println("1: Add an flower to the pack.");
		System.out.println("2: Add an fungus to the pack.");
		System.out.println("3: Add an weed to the pack.");
		System.out.println("0: Main Menu.");

		int addChoice = input.nextInt();

		switch(addChoice){
		case 1:
			Boolean ht = false;
			String id = "Flower";
			System.out.print("Flower name: ");
			String nm = input.next();
			System.out.print("Flower color: ");
			String cl = input.next();
			System.out.print("Flower has thorns? (Y/N): ");
			String hasThorns = input.next().toUpperCase();
			if (hasThorns == "Y"){
				ht = true;
			}
			System.out.print("Flower smell: ");
			String sm = input.next();
			Flower newFwr = new Flower(nm,id,cl,ht,sm);
			plantPack.add(newFwr);
			break;
		case 2:
			Boolean fp = false;
			String fid = "Fungus";
			System.out.print("Fungus name: ");
			String nf = input.next();
			System.out.print("Fungus color: ");
			String co = input.next();
			System.out.print("Fungus is poisionous? (Y/N): ");
			String fHasPoison = input.next().toUpperCase();
			if (fHasPoison == "Y"){
				fp = true;
			}
			Fungus newFun = new Fungus(nf,fid,co,fp);
			plantPack.add(newFun);
			break;
		case 3:
			Boolean hp = false;
			Boolean ed = false;
			Boolean md = false;
			String wid = "Weed";
			System.out.print("Weed name: ");
			String nw = input.next();
			System.out.print("Weed color: ");
			String cw = input.next();
			System.out.print("Weed is poisionous? (Y/N): ");
			String wPoi = input.next().toUpperCase();
			if (wPoi == "Y"){
				hp = true;
			}
			System.out.print("Weed is edible? (Y/N): ");
			String wEdible = input.next().toUpperCase();
			if (wEdible == "Y"){
				ed = true;
			}
			System.out.print("Weed is medicinal? (Y/N): ");
			String wMed = input.next().toUpperCase();
			if (wMed == "Y"){
				md = true;
			}
			Weed newWeed = new Weed(nw,wid,cw,hp,ed,md);
			plantPack.add(newWeed);
			break;
		case 0:
			break;
		default:
			break;
		}		
	}

	private static void removeItem(ArrayList<Plant> plantPack) {
		Scanner input = new Scanner(System.in);

		System.out.println("1: Remove an flower from the pack.");
		System.out.println("2: Remove an fungus from the pack.");
		System.out.println("3: Remove an weed from the pack.");
		System.out.println("0: Main Menu.");

		int addChoice = input.nextInt();

		switch(addChoice){
		case 1:
			for (int i = 0; i < plantPack.size(); i++) {
				if (plantPack.get(i).getid().contains("Flower")) {
					System.out.println("Flower Number: " + (i));
					System.out.println(plantPack.get(i));
				}				
			}
			System.out.print("Which flower would you like to remove?: ");
			int remFlower = input.nextInt();
			plantPack.remove(remFlower);
			System.out.println("Flower " + remFlower + " has been removed\n");
			break;
		case 2:
			for (int i = 0; i < plantPack.size(); i++) {
				if (plantPack.get(i).getid().contains("Fungus")) {
					System.out.println("Fungus Number: " + (i));
					System.out.println(plantPack.get(i));					
				}				
			}
			System.out.print("Which fungus would you like to remove?: ");
			int remFungus = input.nextInt();
			plantPack.remove(remFungus);
			System.out.println("Fungus " + remFungus + " has been removed\n");
			break;
		case 3:
			for (int i = 0; i < plantPack.size(); i++) {
				if (plantPack.get(i).getid().contains("Weed")) {
					System.out.println("Weed Number: " + (i));
					System.out.println(plantPack.get(i));					
				}				
			}
			System.out.print("Which weed would you like to remove?: ");
			int remWeed = input.nextInt();
			plantPack.remove(remWeed);
			System.out.println("Weed " + remWeed + " has been removed\n");
			break;
		case 0:
			break;
		default:
			break;
		}
	}

	private static void searchItem(ArrayList<Plant> plantPack) {
		Scanner input = new Scanner(System.in);

		System.out.println("1: Search flowers in the pack.");
		System.out.println("2: Search fungii in the pack.");
		System.out.println("3: Search weeds in the pack.");
		//System.out.println("4: Search for thorns in the pack.");
		System.out.println("0: Main Menu.");

		int searchChoice = input.nextInt();

		switch(searchChoice){
		case 1:
			for (int i = 0; i < plantPack.size(); i++) {
				if (plantPack.get(i).getid().contains("Flower")) {
					System.out.println("Flowers:\n" + "ID: " + (i));
					System.out.println(plantPack.get(i));
				}				
			}
			break;
		case 2:
			for (int i = 0; i < plantPack.size(); i++) {
				if (plantPack.get(i).getid().contains("Fungus")) {
					System.out.println("Fungii:\n" + "ID: " + (i));
					System.out.println(plantPack.get(i));					
				}				
			}
			break;
		case 3:
			for (int i = 0; i < plantPack.size(); i++) {
				if (plantPack.get(i).getid().contains("Weed")) {
					System.out.println("Weeds:\n" + "ID: " + (i));
					System.out.println(plantPack.get(i));
				}				
			}
			break;
			//			case 4:
			//				for (int i = 0; i < plantPack.size(); i++) {
			//					if (((Flower)i).getthorns().TRUE )
			//				    {
			//						System.out.println("Thorns:\n" + "ID: " + (i));
			//						System.out.println(plantPack.get(i));
			//					}				
			//				}
			//				break;
		case 0:
			break;
		default:
			break;
		}

	}

	private static void displayItem(ArrayList<Plant> plantPack) {
		for (int z = 0; z < plantPack.size(); z++) {
			System.out.println("Plant Number: " + (z + 1));
			System.out.println(plantPack.get(z));
		}
		System.out.println();
	}
	
	private static void saveFile(ArrayList<Plant> plantPack) {
		File saveFile= new File("..\\CSC 275\\src\\Assignment_04\\SavedAnswers.data");
		try {
			FileOutputStream outFileStream = new FileOutputStream(saveFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			for (int z = 0; z < plantPack.size(); z++) {
				outStream.println(plantPack.get(z));
			}
			outStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void loadFile(ArrayList plantPack) {
		try {
			Scanner inFile = new Scanner(new File("..\\CSC 275\\src\\Assignment_04\\SavedAnswers.data"));
			inFile.useDelimiter("\r\n");
			while(inFile.hasNext())
			{
				plantPack.add(inFile.next());
			}
			System.out.println("Answer file loaded");
			displayItem(plantPack);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
