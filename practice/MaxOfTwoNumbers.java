package practice;

import java.util.Scanner;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the 1st value:");
		int num1 = sc.nextInt();
		System.out.print("Enter the 2nd value:");
		int num2 = sc.nextInt();
		
		//alternative short method
		//System.out.printf("The maximum value is: %d" , num1 > num2 ? num1 : num2);
		
		if (num1 > num2) {
			System.out.printf("Max value is: %d%n", num1);
		} else {
			System.out.printf("Max value is: %d%n", num2);
		}
		sc.close();
	}
}