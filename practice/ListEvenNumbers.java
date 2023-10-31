package practice;

import java.util.Scanner;

public class ListEvenNumbers {

	Scanner sc = new Scanner(System.in);

	public int myNumber;

	public void EvenNumbersList() {

		System.out.println("enter number : ");
		
		myNumber = sc.nextInt();

		for (int i = 0; i < myNumber; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");

			}

		}

	}

}
