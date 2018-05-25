package Lab_03;

import java.util.*;

public class Lab_03 {

		public static void main(String[] args) {
			Scanner menu = new Scanner(System.in);
			Student[] studentInfo = new Student[10];
			
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
					addStudent(studentInfo);
					break;
				case 2: 
					removeStudent(studentInfo);
					break;
				case 3: 
					printArray(studentInfo);
					break;
				case 0: 
					System.out.println("Goodbye!");
					System.exit(0);
				}
			}
		}
		
		public static void addStudent(Student studentInfo[]) {
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
			
			for (int i = 0; i < studentInfo.length; i++) {
				if (studentInfo[i] == null) {
					studentInfo[i] = newStud;
					break;
				}
				if (i == studentInfo.length - 1) {
					System.out.println("All Full");
				}
			}
		}
		
		public static void removeStudent(Student studentInfo[]) {
			Scanner input = new Scanner(System.in);
			System.out.println("Which student do you wish to remove? (1-10): ");
			printArray(studentInfo);
			int del = input.nextInt() - 1;
			for (int d = 0; d < studentInfo.length; d++) {
				studentInfo[del] = null;
			}
		}
		
		public static void printArray(Student[] studentInfo) {
			for (int z = 0; z < studentInfo.length; z++) {
				System.out.println("Student Number: " + (z + 1));
				System.out.println(studentInfo[z]);
			}
			System.out.println();
	    }
	}
