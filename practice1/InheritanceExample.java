package practice1;

public class InheritanceExample {

	class Calculation {
		int z;

		public void addition(int x, int y) {
			z = x + y;
			System.out.println("The sum of the given numbers:" + z);
		}

		public void Subtraction(int x, int y) {
			z = x - y;
			System.out.println("The difference between the given numbers:" + z);
		}
	}

	public class My_Calculation extends Calculation {
		
		//implements its own method
		public void multiplication(int x, int y) {
			z = x * y;
			System.out.println("The product of the given numbers:" + z);
		}
		
		

		public static void main(String args[]) {
			int a = 20, b = 10;
			
			InheritanceExample demo = new InheritanceExample();
			My_Calculation demo1 = demo.new My_Calculation();
			
			demo1.addition(a, b);
			demo1.Subtraction(a, b);
			demo1.multiplication(a, b);
		}
	}

}
