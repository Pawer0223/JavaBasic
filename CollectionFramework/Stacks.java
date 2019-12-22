package CollectionFramework;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.add(1);
		st.add(2);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		st.add(6);
		st.add(7);
		st.add(8);
		
		// 마지막 add된 8부터 
		// 2가 나올때까지
		// seq는0아닌 1부터 
		System.out.println(	"search : " + st.search(2));
		
		for ( int i = 0 ; i < st.size(); i ++ ) {
			System.out.println(st.get(i));
		}
		
	}//main
}//class
