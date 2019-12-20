package FunctionClass;

import Interview.classC;

public class AccessControl {

	public static void main(String[] args) {
		
		classC c = new classC();
		
		//System.out.println(c.default_word);
		
		
		// protected는 동일패키지에서는 접근가능 함.
		
		// 다른 패키지에서는 접근 불가능 
		//System.out.println(c.protected_word);
		
		System.out.println(c.public_word);
		
		classA a = new classA();
		
		System.out.println(a.public_word);
		
		
	}//main
}//class
