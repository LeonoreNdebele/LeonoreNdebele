package practice1;

public class ExceptionHandling {

	public static void main(String args[]) {
		try {
			int d = 42;
			int a = 0;
			int c = d / a;

		}catch(ArithmeticException ar) {
			System.out.println("Division by zero error");
		}
		
	}
}
