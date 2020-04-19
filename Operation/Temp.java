package Operation;

public class Temp {
	
	public static void main( String[] args ) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);	
		
		char ch = 'A';
		ch = (char)(ch+2);
		
		System.out.println("c=" + c );
		System.out.println("ch=" + ch );
		
		System.out.println(0/3);
		
		
		System.out.println("1 : " + ((4-1)^(7-1)));
		System.out.println("2 : " + Integer.toBinaryString((4-1)^(7-1)));
		System.out.println("3 : " + Integer.toBinaryString((4-1)^(7-1)).length());
		
	}

}
