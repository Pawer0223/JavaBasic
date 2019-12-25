package Interview;

public class AccessControl {

	public static void main(String[] args) {
		
		classC c = new classC();
		
		System.out.println(c.default_word);
		
		System.out.println(c.protected_word);
		
		System.out.println(c.public_word);
		
		
		classB b = new classB();
		
		
	}//main
	
}//class
