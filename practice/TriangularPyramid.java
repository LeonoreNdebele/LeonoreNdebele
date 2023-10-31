package practice;

import java.util.Scanner;

public class TriangularPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a name : ");


		String name = sc.next();

		int n = name.length();

		for (int i = 1; i <= n; i++) {

			for (int space = n - i; space >= 1; space--) {

				System.out.print(" ");

			}

			for (int j = 0; j < i; j++) {

				System.out.print(" " + name.charAt(j) + " ");

			}

			System.out.println();

		}

		sc.close();

	}

}
