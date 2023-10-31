package practice1;

import java.util.Arrays;

public class ArrayAscOrder {

	public static void main(String[] args) {

		int[] array1 = { 12, 10, 6, 2, 1, 6, 11 };

		Arrays.sort(array1);
		for ( int i = 0; i < array1.length; i++){
			if (i>0) {
				System.out.print("*");
			}
			
			System.out.print(array1[i]);

		}
	}

}
