package practice1;

import java.util.ArrayList;

public class ArrayListExArgs {
	
	public static void main (String[] args) {
		
		ArrayList<Integer> array2 = new ArrayList<>();
		
		//Adding elements into the list as arguments at runtime
		
		for (String arg : args) {
			array2.add(Integer.parseInt(arg));
		}
		
		//sorting the contents of the array
		
		array2.sort(null);
		
		//printing the contects of the array one by one
		
		for(int i : array2) {
			System.out.println(i);
		}
		
		
	}


}
