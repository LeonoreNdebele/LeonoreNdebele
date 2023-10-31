package practice;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a name : ");


		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isAlphabetic(ch)) {

				System.out.print(ch);

			} else if (ch == '.' || ch == ',' || ch == ';') {

				System.out.println();

			}

		}

		sc.close();

	}

}
