package String;

public class Strings {

	public static void main(String[] args) {
		
		System.out.println("### String 클래스 ###");
		String a = "ㄱ";
		String aa = "ㄱ";
		String b =  new String("ㄱ");
		String bb = b.intern();
		
		System.out.println(" 문제 1 : " + (a==aa));
		System.out.println(" 문제 2 : " + (a.equals(aa)));
		
		System.out.println(" 문제 3 : " + (a==b));
		System.out.println(" 문제 4 : " + (a.equals(b)));
		
		System.out.println(" 문제 5 : " + (a==bb));
		
		System.out.println("### StringBuffer 클래스 ### ");

		StringBuffer c = new StringBuffer("a");
		StringBuffer d = new StringBuffer("a");

		System.out.println(" 문제 6 : " + (c==d));

		// StringBuffers클래스는 eqauls메서드가 오버라이딩되어있지 않아서 ==연산자와 마찬가지로 주소 값을 비교한다.
		System.out.println(" 문제 7 : " + c.equals(d));
		
		System.out.println(" 문제 8 : " + "c.toString().equals(d.toString())");
		
		

		
		
	}//main
}//class
