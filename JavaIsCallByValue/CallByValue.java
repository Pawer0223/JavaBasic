package JavaIsCallByValue;

public class CallByValue {

	public static void main(String[] args) {
		
		ClassA a = new ClassA(" 최초생성 상태입니다. ");
		
		System.out.println("### 참조변수를 넘겨서 생성자를 통한 전역변수 변경 ###");
		// 안 바뀜
		System.out.println("넘기기 전 a의 주소 : " + a);
		a.callByValue(a);
		System.out.println("결과 : " + a.getWord());
		
		System.out.println();
		
		System.out.println("### 참조변수를 넘겨서 전역변수의 값을 직접 변경 ###");
		// 바뀜
		System.out.println("넘기기 전 a의 주소 : " + a);
		a.callByValue2(a);
		System.out.println("결과 : " + a.getWord());		
	}//main
}//class
