package ComparableAndComparator;

import java.util.Arrays;

public class ComparablePractice {

	/*
	 * Comparable인터페이스란 
	 * 
	 * Arrays.sort()나 Collections.sort()로 정렬을 수행하게되면 compareTo메소드로 정렬을 한다.
	 * compareTo()는 Comparable인터페이스에 정의 된 메소드이고, 기본적으로 비교를 할 수 있는 클래스 들에는 compareTo()가 오버라이드 되어있다.(String,Integer,Date,File)
	 * 
	 * 기본적으로 오름차순으로 정렬 되도록 정의되어 있다.
	 * 
	 * 예를들어 [ 이름,학년,성별 ]의 값을가진 학생클래스를 학교라는 배열에 담은 후 학년별로 정렬을 하고싶다면???
	 * 
	 * 학생클래스에 Arrays.sort()가 수행 될 때 학년 기준으로 정렬을해라!라고 설정해주면 된다. ( = compareTo()메소드를 학년 기준으로 정렬 되도록 재정의 해주면 된다. )   
	 * 
	 */

	public static void main(String[] args) {

		Student[] school = new Student[5];

		Student s1 = new Student("s3","남",1);
		Student s2 = new Student("a555","남",1);
		Student s3 = new Student("s444","여",1);
		Student s4 = new Student("s333","남",3);
		Student s5 = new Student("s222","여",2);		

		school[0] = s1;
		school[1] = s2;
		school[2] = s3;
		school[3] = s4;
		school[4] = s5;

		Arrays.sort(school);

		for ( int i = 0 ; i < 5; i ++ ) {
			System.out.println( " 반 : "+school[i].getGroup() +", 이름 : " + school[i].getName() + ", 성별 : " + school[i].getGender() );
		}
	}	
}
