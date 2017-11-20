package e2017.exam1;

import java.util.Arrays;

public class Example11 {

	static void printSum(int... a) { 
		System.out.print("배열 : " + Arrays.toString(a));
		int sum = 0;
		for (int s : a) 
			sum += s;
		System.out.print(" 합계 : " + sum + "\n");

	}
	public static void main(String[] args) {
		int[] a = new int[] { 21, 33, 17, 40, 5, 13 }; 

		printSum( 11, 13, 17, 20 ); 
		printSum( a );
	}

}
