package Lab_08;

import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> QandA = new ArrayList<String>();
		System.out.print("Load answers from file? (Y/N)");
		String loadFile = input.next().toUpperCase();
		if (loadFile.equals("Y") || loadFile.equals("YES"))
		{
			loadFromFile(QandA);
		}
		else {
			createNewFile(QandA);
		}
	}

	public static void createNewFile(ArrayList<String> QandA) {
		Scanner input = new Scanner(System.in);
		
		String q1 = "What is your first name? ";
		System.out.print(q1);
		String q1Ans = input.nextLine();
		QandA.add(q1 + q1Ans);
		String q2 = "What is your favorite color? ";
		System.out.print(q2);
		String q2Ans = input.nextLine();
		QandA.add(q2 + q2Ans);
		String q3 = "What city were you born in? ";
		System.out.print(q3);
		String q3Ans = input.nextLine();
		QandA.add(q3 + q3Ans);
		String q4 = "What is your favorite food? ";
		System.out.print(q4);
		String q4Ans = input.nextLine();
		QandA.add(q4 + q4Ans);
		String q5 = "Light Side or Dark Side? ";
		System.out.print(q5);
		String q5Ans = input.nextLine();
		QandA.add(q5 + q5Ans);
		String q6 = "XBox, PlayStation, Wii, or PC? ";
		System.out.print(q6);
		String q6Ans = input.nextLine();
		QandA.add(q6 + q6Ans);
		String q7 = "What would you buy with a million dollars? ";
		System.out.print(q7);
		String q7Ans = input.nextLine();
		QandA.add(q7 + q7Ans);
		String q8 = "What is your favorite movie? ";
		System.out.print(q8);
		String q8Ans = input.nextLine();
		QandA.add(q8 + q8Ans);
		
		Path out = Paths.get("..\\CSC 275\\src\\Lab_08\\SavedAnswers.data");
		try {
			Files.write(out, QandA, Charset.defaultCharset());
			System.out.println("Answers saved to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void displayArray(ArrayList<String> QandA) {
		for (int z = 0; z < QandA.size(); z++) {
			System.out.println(QandA.get(z));
		}
		System.out.println();
	}

	private static void loadFromFile(ArrayList<String> QandA) {
		try {
			Scanner inFile = new Scanner(new File("..\\CSC 275\\src\\Lab_08\\SavedAnswers.data"));
			while(inFile.hasNextLine())
			{
				QandA.add(inFile.nextLine());
			}
			System.out.println("Answer file loaded");
			displayArray(QandA);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
