package oopsConcept;

public class Main {
	
	public static void main (String[] args) {
//		InheritanceExample1 in = new InheritanceExample1();
//		in.inherit();
//		in.inheritClass1();
//		
//		AtmInheritanceExample1 atm = new AtmInheritanceExample1();
//		atm.insertCard();
//		
//		Bank b = new Bank();
//		b.customerPin();
//		b.printInfo();
		
//		ExampleInterface ex = new Child();
//		ex.printInfo();
//		ex.printInfo1();
		
		Vehicle v = new Car("Audi", "100miles/hr",100000.00);
		System.out.println(v.getBrand() + " " + v.getSpeed() + " " + v.getPrice());
		
		Bicycle bike = new Mountainbike(5, 20, 3);
		System.out.println("brake increase is : " + bike.ApplyBrakes() + " "+"No of gears is  :" + bike.Gear() + " " +"increasing speed by :" + bike.speedUp());
		
//		C c = new C();
//		c.printInfo();
//		c.printInfo1();
//		
//		Child ex = new Child();
//		ex.printInfo();
		
		
	}
	

}
