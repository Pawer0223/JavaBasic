package JavaIsCallByValue;

public class ClassA  {

	private String word;

	ClassA(String word ){
		this.word= word;
	}

	void call() {
		System.out.println(word);
	}

	void callByValue( ClassA a ) {
		
		System.out.println("생성자 생성 전 a의 주소 : " + a );
		
		a = new ClassA(" new 연산자를 통한 전역변수 초기화 ");
		
		System.out.println("생성자 생성 전 후 a의 주소 : " + a );
	}

	void callByValue2( ClassA a ) {
		System.out.println("전달받은 a의 주소 값 : " + a );
		a.setWord(" 전달받은 후 전역변수 변경 ");
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}


}

