package ComparableAndComparator;

public class Student implements Comparable<Student>{

	String name 	;
	String gender   ;
	int group   	;
	
	Student ( String name , String gender , int group ){
		this.name = name;
		this.gender = gender;
		this.group = group;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(Student st) {
		//return Integer.valueOf(group).compareTo(st.getGroup()); // 반을기준으로
		 return name.compareTo(st.getName()); // 이름을 기준으로
		// return gender.compareTo(st.getGender()); // 성별을 기준으로
	}

}//class