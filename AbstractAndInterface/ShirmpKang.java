package AbstractAndInterface;

public class ShirmpKang implements Snack {

	@Override
	public void buy() {
		System.out.println(" 새우깡 삿다 ");

	}

	@Override
	public void eatiingSound() {
		System.out.println(" 새우깡 먹을때 바삭소리가 크다 ");		
	}
	
	public void price() {
		System.out.println( "나는 1300원 ");
	}


}
