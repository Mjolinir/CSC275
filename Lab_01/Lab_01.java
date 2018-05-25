package Lab_01;

import java.util.*;

public class Lab_01 {
	public static void main(String[] args){
		int arraySize = 100;
		int[] intArray = new int[arraySize];
		Random generator = new Random();
		for (int i = 0;i < intArray.length; i++) {
			intArray[i] = generator.nextInt(arraySize) + 1;
		}
		while(true) {
		promptUser(intArray);
		}
	}
	
	public static void promptUser (int intArray[] ) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 100 (0 to quit): ");
		while (input.hasNext()) {
			int r = 0;
			int n = input.nextInt();
			boolean found = false;
			if (n == -1) {
				displayArray(intArray);
			}
			if (n == 0) {
				System.exit(0);
			}
			for (int i = 0; i < intArray.length; i++) {
				if (n == intArray[i]) {
					found = true;
					r = i;
				}
			}
			if (found) {
				System.out.println("We found your number " + n + " at position " + r + " in the array");
			}
			else {
				System.out.println(n + " not found");
			}
			break;
		}
	}
	
	public static void displayArray(int intArray[]) {
		for (int x = 0;x < intArray.length; x++) {
			System.out.println(intArray[x]);
		}
	}
}
