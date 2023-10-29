package oopsConcept;

import java.util.Scanner;

public abstract class AbstractExample {

	abstract void customerPin();// we don't write the body here, we write it on the class that extends
	// can have body only whenits static /default mathod

	void printInfo() {
		System.out.println("Abstract class !!");

	}

}

class Bank extends AbstractExample {

	Bank() {
		super.printInfo();

	}

	@Override

	void customerPin() {
		System.out.print("Enter your pin : ");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();

		System.out.print("Enter amount : ");
		float amnt = sc.nextFloat();
		System.out.println(" You entered amount : " + amnt);
		System.out.println("Withdraw cash & card!");
		sc.close();

	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("Extended class");

	}

}
