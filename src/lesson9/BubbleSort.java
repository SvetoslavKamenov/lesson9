package lesson9;

import java.util.Arrays;

public class BubbleSort {
		// comments by SK
	public static void main(String[] args) {
		int[] a = { 9,8,7,6,5,4,3,2,1};
		
			// sub is subtrahend, increases and makes the next loop decrease	
			// 1) write sub++
			// 2) solve equations for start value
			// 3) solve equations for end value
		for (int sub = 0; sub < a.length-1 ; sub++) {
			
				// standard iteration
			    // decreasing loop, always starts from index 1  				 			 
			 	// put -sub into upper limit formula to lower it every iteration
			for (int j = 1; j < a.length-sub; j++) {
				
					// check couples for bubble								 
				if (a[j-1] > a[j]) {
					 	// swap
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
			 		
		}
		System.out.println(Arrays.toString(a));

	}
}
