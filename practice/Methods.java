package practice;

import java.io.IOException;
import java.util.Scanner;

public class Methods {
	
Scanner scanner = new Scanner(System.in);
	

	static void myMethod() {
		System.out.println("I just got executed");
	}
	//passing data parameters into methods
	//fnmae is a parameter and Linda SoSO and Leota are arguments
	//the void keyword indicates that the method should return a value
	
	static void anotherMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}

	static int secondMethod(int x) {
		return 5 + x;
	}
	//Example returning the sum of 2 numbers
	


	static int sumOfTwoNumbers(int x, int y) {	
		
		return x + y;
		
	}
	
	//CheckAge Method 6 Pqrq;eters and arguments
	
	static void checkage(int age) {
		if (age < 18) {
		System.out.println("Access denied");
		
		}else {
			System.out.println("Access granted ");
		}
		
	}
	
	//Method overloading, multiple methods can have the same name
	
	static void plusMethodInt(int x, int y) {
		System.out.println("Int : " + x + y);
	}
	
	static double plusMethodDouble(double x, double y) {
		return x*y;
	}
	
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		myMethod();
		anotherMethod("Linda", 5 );
		anotherMethod("Soso", 10 );
		System.out.println(secondMethod(3));
		System.out.println(sumOfTwoNumbers(5,3));
		
		int z = secondMethod(5);
		System.out.println(z);
		
		checkage(20);
		
		plusMethodInt(5,7);
		System.out.println("Double :" + plusMethodDouble(5.2,7.5));


		
	}
	
	

}
