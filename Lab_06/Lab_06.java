package Lab_06;

import java.util.Scanner;

public class Lab_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String isThisAPalindrome = input.next().trim();
		checkIsPalindrome(isThisAPalindrome);
		checkIsPalindromeSB(isThisAPalindrome);
	}

	private static void checkIsPalindrome(String isThisAPalindrome) {
			String backward = "";
			for (int n = isThisAPalindrome.length() - 1; n >= 0; n--)
			{
				backward = backward + isThisAPalindrome.charAt(n);
			}
			if (isThisAPalindrome.equals(backward))
			{
				System.out.println("Is a palindrome via char method");
				System.out.println("");
			}
			else
			{
				System.out.println("Not a palindrome via char method");
				System.out.println("");
			}
		}
	
	private static void checkIsPalindromeSB(String isThisAPalindrome) {
		StringBuffer sb1 = new StringBuffer(isThisAPalindrome);
		sb1.reverse();
		if (sb1.toString().equals(isThisAPalindrome))
		{
			System.out.println("Is a palindrome via StringBuilder method");
			System.out.println("");
		}
		else
		{
			System.out.println("Not a palindrome via StringBuilder method");
			System.out.println("");
		}
	}
}
