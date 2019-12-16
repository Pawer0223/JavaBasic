package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		
		// index는 내부 해쉬 함수를 통해 계산된다.
		// 내부 hash값에 따라서 키순서가 정해지므로 특정 규칙없이 출력된다.
		// key와 value에 null값을 허용한다.
		// 비동기 처리
		Map<String,Integer> hashM = new HashMap<String,Integer>();
		
		hashM.put("가", 1);
		hashM.put("나", 2);
		hashM.put("다", 3);
		hashM.put("라", 4);
		hashM.put("마", 5);
		
		System.out.println(" hashMap의 key값 : " + hashM.keySet().toString());
		System.out.println(" hashMap의 value값 : " + hashM.values().toString());

		// 입력 순서대로 출력된다.
		// HashMap을 상속받으며, LinkedList로 저장이 된다.
		Map<String,Integer> likedHashM = new LinkedHashMap<String,Integer>();
		
		likedHashM.put("라", 5);
		likedHashM.put("가", 2);
		likedHashM.put("나", 1); 
		likedHashM.put("카", 2);
		likedHashM.put("차", 2);		
		
		System.out.println(" likedHashM의 key값 : " + likedHashM.keySet().toString());
		System.out.println(" likedHashM의 value값 : " + likedHashM.values().toString());
		
		// 키값이 기본적으로 오름차순 정렬되어 출력된다.
		// 키값에대한 Comparator구현으로 정렬방법을 지정할 수 있다.
		Map<String,Integer> treeM = new TreeMap<String,Integer>();
		
		treeM.put("하", 1);
		treeM.put("파", 2);
		treeM.put("가", 100);
		treeM.put("카", 4);
		treeM.put("차", 5);		
		
		System.out.println(" treeM의 key값 : " + treeM.keySet().toString());
		System.out.println(" treeM의 value값 : " + treeM.values().toString());
			
		
		
	}//main
}//class
