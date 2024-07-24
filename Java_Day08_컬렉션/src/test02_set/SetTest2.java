package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();
		
		set.add(new Person("luna", 3));
		set.add(new Person("luna", 3));
		
		
		// 두사람 출력!
		// set이 같다고 판단하는 기준: hashcode도 같고 equals도 같다
		System.out.println(set);
		
		// 사용자 정의 클래스를 사용하는 경우
		// Set을 사용하기 위해서는 hashCode(), equals() 메소드 오버라이드 해야
	}

}
