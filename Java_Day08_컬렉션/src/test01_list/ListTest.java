package test01_list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		// List
		// 순서도 있고, 중복도 허용
		
		List<String> names = new ArrayList<>();
		
		// 원소의 추가
		names.add("luna");
		names.add("max");
		names.add("daisy");
		names.add("max");
		
//		System.out.println(names);
//
//		// 리스트가 비어있는지 체크
//		System.out.println(names.isEmpty());
//		
//		// 수정
//		names.set(0, "emily");
//		System.out.println(names);
//		
//		// 조회
//		System.out.println(names.get(3));
//		
//		// 순회
//		for (String name : names) {
//			System.out.println(name);
//		}
//		// 삭제
//		names.remove(0); // 인덱스 이용
//		System.out.println(names);
//		
//		names.remove("max"); // 값 이용, 중복 값은 앞에 한개만 삭제
//		System.out.println(names);
//		
//		// 전부 삭제
//		names.clear();
//		System.out.println(names);
		
		// 주의: 중복 값 삭제 시
		names.add("max");
//		// 틀린 답: 앞에서부터 삭제
//		for (int i=0; i<names.size(); i++) {
//			if (names.get(i).equals("max"))
//				names.remove(i);
//		}
//		System.out.println(names);
//		// 삭제 시 인덱스도 바뀌도 리스트 사이즈도 바뀐다!
		// 뒤에서부터!!!
		for (int i=names.size()-1; i>=0; i--) {
			if (names.get(i).equals("max"))
				names.remove(i);
		}
		System.out.println(names);
	}
}
