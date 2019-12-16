package Sorts;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 5,3,2,6,1 };

		System.out.println( " 수행 전 : " + Arrays.toString(arr));

		for ( int i = 0 ; i < arr.length-1; i ++ ) {
			int minIndex = i ;
			for ( int j = i+1; j < arr.length; j++  ) {
				if ( arr[j] < arr[i] ) {
					minIndex = j ;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println( " 수행 후 : " + Arrays.toString(arr));

	}//main
}//class
