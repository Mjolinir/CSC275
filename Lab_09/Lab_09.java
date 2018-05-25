package Lab_09;

import java.util.*;
import java.io.*;

public class Lab_09 {

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		ArrayList studentInfo = new ArrayList();

		while (true) {
			System.out.println(" ");
			System.out.println("1: Add a Student.");
			System.out.println("2: Remove a Student.");
			System.out.println("3: List all Students.");
			System.out.println("4: Save Students.");
			System.out.println("5: Load Students.");
			System.out.println("0: Exit App");
			System.out.println(" ");
			System.out.print("What would you like to do?: ");
			int userChoice = menu.nextInt();
			switch(userChoice){
			case 1: 
				addStudent(studentInfo);
				break;
			case 2: 
				removeStudent(studentInfo);
				break;
			case 3: 
				printArray(studentInfo);
				break;
			case 4: 
				saveArray(studentInfo);
				break;
			case 5: 
				loadArray(studentInfo);
				break;
			case 0: 
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}
	}

	public static void addStudent(ArrayList studentInfo) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String fn = input.next();
		System.out.print("Enter Last Name: ");
		String ln = input.next();
		System.out.print("Enter Major: ");
		String mj = input.next();
		System.out.print("Enter GPA: ");
		double gpa = input.nextDouble();
		System.out.print("Enter UIN: ");
		int uin = input.nextInt();
		System.out.print("Enter NetID: ");
		String nid = input.next();
		System.out.print("Enter Age: ");
		int age = input.nextInt();
		System.out.print("Enter Gender (M/F): ");
		String gen = input.next().toUpperCase();

		Student newStud = new Student(fn, ln, mj, gpa, uin, nid, age, gen);
		studentInfo.add(newStud);
		System.out.println("Student added");
	}

	public static void removeStudent(ArrayList studentInfo) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which student do you wish to remove? (1-10): ");
		printArray(studentInfo);
		int del = input.nextInt() - 1;
		studentInfo.remove(del);
		System.out.println("Student " + (del + 1) + " removed");
	}

	public static void printArray(ArrayList studentInfo) {
		for (int z = 0; z < studentInfo.size(); z++) {
			System.out.println("Student Number: " + (z + 1));
			System.out.println(studentInfo.get(z));
		}
		System.out.println();
	}

	public static void saveArray(ArrayList studentInfo) {
		File saveFile= new File("..\\CSC 275\\src\\Lab_09\\SavedAnswers.data");
		try {
			FileOutputStream outFileStream = new FileOutputStream(saveFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			for (int z = 0; z < studentInfo.size(); z++) {
				outStream.println(studentInfo.get(z));
			}
			outStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public static void loadArray(ArrayList studentInfo) {
		try {
			Scanner inFile = new Scanner(new File("..\\CSC 275\\src\\Lab_09\\SavedAnswers.data"));
			inFile.useDelimiter("\r\n");
			while(inFile.hasNext())
			{
				studentInfo.add(inFile.next());
			}
			System.out.println("Answer file loaded");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}