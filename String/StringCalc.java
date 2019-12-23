package String;

public class StringCalc {
	
	public static void main(String[] args ) {
		
		
		// 문자열 연산은 무조건 문자열로 바뀌어서 계산된다 , null + ""도됨
		// 1+2+"" 하면 12됨 
		// 특수문자는 _와 $ 가능 
		
		System.out.println(1+2);
		
		System.out.println("" + 1 + 2 );
		
		System.out.println( "" + (1 + 2) );
		
		System.out.println( "a" + 'b' );
		
		System.out.println( true + "" );
		
		System.out.println( null + "123" );
		
		int $a = 3;
		
		int _a = 3;
		
		System.out.println( "1+2 :" + $a+_a);
		
		System.out.println( true || false );
		System.out.println( true && false );
		
	}//main
}//class
