package Lab_12;

import java.util.*;

public class Lab_12 {
	public static LinkedList studentInfo = new LinkedList();

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);


		while (true) {
			System.out.println(" ");
			System.out.println("1: Add a Student.");
			System.out.println("2: Remove a Student.");
			System.out.println("3: List all Students.");
			System.out.println("0: Exit App");
			System.out.println(" ");
			System.out.print("What would you like to do?: ");
			int userChoice = menu.nextInt();
			switch(userChoice){
			case 1: 
				addStudent();
				break;
			case 2: 
				removeStudent();
				break;
			case 3: 
				printArray();
				break;
			case 0: 
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}
	}

	public static void addStudent() {
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
		studentInfo.append(newStud);
		System.out.println("Student added");
	}

	public static void removeStudent() {
		Scanner input = new Scanner(System.in);
		System.out.println("Which student do you wish to remove? (1-10): ");
		studentInfo.print();
		int del = input.nextInt() - 1;
		studentInfo.delete(del);
		System.out.println("Student " + (del + 1) + " removed");
	}

	public static void printArray() {
		studentInfo.print();
	}
}