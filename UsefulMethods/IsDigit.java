package UsefulMethods;

public class IsDigit {

	public static void main(String[] args) {

		System.out.println('0');

		String s = "abc01234def";

		char[] arr = s.toCharArray();

		for ( char c : arr ) {
			System.out.println( c +" 는 숫자 ?? : " + Character.isDigit(c));

			// char타입의 숫자를 int 자료형에 담으려면 Unicode값을 빼줘야한다.
			// Unicode에서 숫자 '0'은 48 숫자 '1'은 49이므로 
			// -'0'하면 원하는 int값이 저장 될 수 있다.

			int nonCalcC = c;
			int calcC = c-'0';
			
			if ( Character.isDigit(c) ) {
				System.out.println( " [ -0 하기 전 변수 c의 값 : " + nonCalcC + " ] , [ -0 해준 후 변수 c의 값 : " + calcC+" ]");
				System.out.println();
			}
		}
	}//main

}//class
