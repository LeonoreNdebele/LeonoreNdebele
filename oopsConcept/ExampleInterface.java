package oopsConcept;

public interface ExampleInterface {
	
	/* An abstract class can declare instance variables, with all possible access modifiers, 
	 * and they can be accessed in child classes. An interface can only have public, static,
	 * and final variables and can't have any instance variables. */
	
	void printInfo();

	default void printInfo1() {
		System.out.println("Interface Class");
	}
	static void printInfo2() {
		System.out.println("Static Interface Class");

	}

}

abstract class AbstractExample1 {
	
	abstract void printInfo();

	void print() {
		System.out.println("Abstract Class");

	}

}

class Child extends AbstractExample1 implements ExampleInterface {

	@Override
	public void printInfo() {
		super.print();
		System.out.println("Class Child");

	}




}
