package lesson9;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] a = { 9,8,7,6,5,4,3,2,1};
			// must be length -1, but works with length also
		for (int j = 0; j < a.length-1 ; j++) {
			
			    // decreasing loop search from j+1 to the end 
				// if found smaller element, it becomes the new Min
				// move indexOfMin to its index
			int indexOfMin = j;
			for (int i = j+1; i < a.length; i++) {
					//move indexOfMin
				if (a[i] < a[indexOfMin]) {
					indexOfMin = i;
				}
			}
			if (indexOfMin != j){
				// indexOfMin has moved
				// swap a[j] with a[indexOfMin]
				int temp =  a[j];
				a[j] = a[indexOfMin];
				a[indexOfMin] = temp;				
			}											
		}
		System.out.println(Arrays.toString(a));

	}

}
