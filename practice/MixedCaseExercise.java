package practice;

import java.util.Scanner;

public class MixedCaseExercise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");


		String str = sc.next();

		char[] ch = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			ch[i] = str.charAt(i);

		}

		for (int i = 0; i < str.length(); i = i + 2) {

			// ASCII values from 97 - 122

			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {

				ch[i] = Character.toUpperCase(str.charAt(i));

			}

			// ASCII values from 65 - 91

			else if (str.charAt(i) >= 65 && str.charAt(i) <= 91) {

				ch[i] = Character.toLowerCase(str.charAt(i));

			}

		}

		System.out.println(ch);

		sc.close();

	}

}
