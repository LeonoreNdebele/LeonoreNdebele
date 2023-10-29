package oopsConcept;

public class InheritanceExample {

	public void inherit() {

		System.out.println("Hello");
	}

	public void inheritClass1() {
		System.out.println("Class1");
	}

}

class InheritanceExample1 extends InheritanceExample {
	@Override

	public void inherit() {

		System.out.println("Java");

	}

}