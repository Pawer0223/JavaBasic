package FunctionClass;

import FunctionClass.classC;

public class classA extends classC {
	
//	protected String word = "classA";
	public String word = "classA";
	
	private String pv_word = "private_word";

	public void callC() {
		
		System.out.println("############## classA에서 호출하는다 ##############");
		
		System.out.println(public_word);
		
		// 다른 패키지의 class에서 protected변수를 사용 할 수 있음.
		// 해당 클래스와 상속관계에 있는 클래스에서는 접근이 가능함.
		System.out.println(protected_word);

		
		System.out.println(default_word);
		//System.out.println(private_word);
		
	}
	
}

