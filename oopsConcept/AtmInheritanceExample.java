package oopsConcept;

public class AtmInheritanceExample {
	
	
	
	public void insertCard() {
		System.out.println("card inserted ....");
	}
	
	public void inheritClass1() {
		System.out.println("enter pin : ");
	}
	
	
}
	
class AtmInheritanceExample1 extends AtmInheritanceExample {
	@Override
	public void insertCard() {

		System.out.println("enter amount : ");	

	}
}


