package Sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = { 5,3,2,6,1 };

		System.out.println( " 수행 전 : " + Arrays.toString(arr));
		
		for ( int i = 1 ; i < arr.length; i ++ ) {
			
			int temp = arr[i];
			
			int j = i-1;
			
			while ( j >= 0 && arr[j] > temp ) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
			
		}
		
		
		System.out.println( " 수행 후 : " + Arrays.toString(arr));
		

	}

}
