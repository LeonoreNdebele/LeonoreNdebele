package practice;

import java.util.Scanner;

public class GradesDisplay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the subject:");

		String subject = sc.next();

		System.out.print("Enter the Grade:");

		char y = sc.next().charAt(0);

		switch(y) {

		case 'A' :

		case 'a':

		System.out.println("Excellent");

		break;

		case 'B':

		case 'b':

		System.out.println("Good");

		break;

		case 'C':

		case 'c':

		System.out.println("Try harder");

		default:

		System.out.println("Failed");

		break;

		}

		sc.close();

		}

		}
