package test08_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		// 정렬
		// 순서가 있는 자료구조
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("daisy", 3));
		persons.add(new Person("luna", 5));
		persons.add(new Person("max", 6));
		persons.add(new Person("alice", 2));
		
		System.out.println(persons);
		
		// 정렬
		// Collections 유틸리티 클래스의
		// .sort() 메소드
		// 사용자 정의 클래스 리스트는 기본적으로 정렬 불가
		
		Collections.sort(persons);
		System.out.println(persons);
		
		

	}

}
