package Sorts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		// 인접한 두개를 비교하면서 조건에 맞으면 종료한다.
		
		int[] arr = { 5,3,2,16,1};
		
		System.out.println( " 수행 전 : " + Arrays.toString(arr));
		
		for ( int i = 0 ; i < arr.length; i ++ ) {
			for ( int j = 1; j < arr.length-i; j++) {
				
				if ( arr[j-1] > arr[j] ) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
		
		System.out.println( " 수행 후 : " + Arrays.toString(arr));
		
		
	}//main	
}//class
