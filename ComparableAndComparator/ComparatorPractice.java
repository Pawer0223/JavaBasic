package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {


	public static void main(String[] args) {

		List<Foods> candidate = new ArrayList<Foods>();

		candidate.add(new Foods( "오므라이스" , 7000));
		candidate.add(new Foods( "레드와인을 곁들인 스테이크" , 25000));
		candidate.add(new Foods( "섬섬옥수" , 1000));
		candidate.add(new Foods( "김밥" , 2500));
		candidate.add(new Foods( "떡볶이 ", 3000));
		candidate.add(new Foods( "한우스테이크" , 34000));
		candidate.add(new Foods( "된장국" , 6500));
		candidate.add(new Foods( "돈까스" , 8000));

		System.out.println( " ##### Before Sort ##### ");
		show(candidate);
		System.out.println();

		Collections.sort( candidate , new Comparator<Foods>() {

			@Override
			public int compare(Foods o1, Foods o2) {

				// 이름이 길면은  앞에오도록 
				return o2.getName().length() - o1.getName().length() ;
				
				// 이름이 긴것이 뒤에가도록
				// return o1.getName().length() - o2.getName().length() ;
			}

		});

		System.out.println( " ##### After Sort ##### ");
		show(candidate);

	}

	private static void show(List<Foods> candidate) {

		for ( int i = 0 ; i < candidate.size(); i ++ ) {
			Foods f = candidate.get(i);
			System.out.println( " 이름 : " + f.getName() + ", 가격  : " + f.getPrice() );
		}

	}
}
