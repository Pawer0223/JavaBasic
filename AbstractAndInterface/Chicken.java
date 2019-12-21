package AbstractAndInterface;

public class Chicken extends Food {

	@Override
	public void eat() {
		System.out.println(" 치킨을 먹는다 ");		
	}

	@Override
	public void make() {
		System.out.println(" 치킨을 만든다 ");
	}
	
	public void material() {
		System.out.println("나의 재료는 닭 ");
	}
	

}
