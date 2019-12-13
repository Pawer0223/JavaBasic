package UsefulMethods;

public class BitOperator {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		
		String binaryA = Integer.toBinaryString(a);
		String binaryB = Integer.toBinaryString(b);
		
		System.out.println("   "+binaryA +"\n"+"   "+binaryB);
		System.out.println("   ----------");
		
		int orResult = a|b;
		int andResult = a&b;
		int xorResult = a^b;
		
		System.out.println( "   | 연산의 결과 : " + Integer.toBinaryString(orResult)+ " ( "+orResult+" )" );
		System.out.println( "   & 연산의 결과 : " + Integer.toBinaryString(andResult)+ " ( "+andResult+" )" );
		System.out.println( "   ^ 연산의 결과 : " + Integer.toBinaryString(xorResult)+ " ( "+xorResult+" )" );
		
	}//main

}//class
