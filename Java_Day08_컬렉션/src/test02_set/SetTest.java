package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		// Set
		// 순서 없음, 중복 안됨
		// 집합
		
		// 구현체 HashSet
		Set<String> names = new HashSet<>();
		
		names.add("luna");
		names.add("max");
		names.add("luna");
		names.add("daisy");
		names.add("max");
		
		System.out.println(names); // 순서 유지 안함
		
		
	}

}
