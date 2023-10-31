package practice;

//Technique of making a function call itself
public class Recursion {

	public static int sum(int k) {
		// Stopping condition is when k = 0 to avoid infinite recursion
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}
	
	// example2 - Using recursion to add numbers between 5 and 10
	
	public static int sum1(int start, int end) {
		if (end > start) {  //stop condition is when end is not greater than start
			return end + sum1(start, end - 1);
		} else {
			return end;
		}
	}

	public static void main(String[] args) {
		int result = sum(3);
		System.out.println(result);
		int result1 = sum1(5, 10);
		System.out.println(result1);
		
	}


	

}
