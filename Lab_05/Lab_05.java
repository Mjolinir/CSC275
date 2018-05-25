package Lab_05;

import java.util.Scanner;

public class Lab_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number (1-26): ");
		int userNumber = in.nextInt();
		System.out.print("Enter a phrase: ");
		String userPhrase = in.next();

		for (int d = 0; d < userPhrase.length() ; d++) {
			int newNumber = (int)userPhrase.charAt(d) + userNumber;
			System.out.print((char)newNumber);
		}
	}

}
