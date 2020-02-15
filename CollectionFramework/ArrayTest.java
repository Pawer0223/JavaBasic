package CollectionFramework;

import java.util.Arrays;

public class ArrayTest {
	
	static void copyTest() {
		int[] arr1 = { 1,2,3 } ;
		int[] arr2 = { 4,5,6 } ;
		
		arr1 = arr2;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	
	static void twoArrTest() {
		
		int[][] arr = {
				{1,2}, {3,4}
		};
		
		
		arr[0][3] = 100;
		
		
		for(int i = 0 ; i < 2; i ++ ) {
			for ( int j=0; j < 2; j++ ) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		// copyTest();
		twoArrTest();
	}
}
