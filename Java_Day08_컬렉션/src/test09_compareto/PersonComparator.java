package test09_compareto;

import java.util.Comparator;

// 비교기준 만들기
// 2. Comparator 구현
public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// 순서대로 빼면 => 오름차순
		// 역순으로 빼면 => 내림차순
		return o1.age - o2.age; 	
	}

	@Override
	public String toString() {
		return "PersonComparator [toString()=" + super.toString() + "]";
	}
	
	

}
