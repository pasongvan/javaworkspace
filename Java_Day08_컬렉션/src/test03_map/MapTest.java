package test03_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// Map
		// 사전과 같은 자료 구조
		// 키 & 값의 쌍
		// 키는 중복x, 값은 중복 가능
		
		// Map<키자료형, 값자료형> map = new HashMap<>();
		
		// Map의 키자료형으로 사용자 정의 클래스가 온다면?
		// Set의 경우와 마찬가지로 hashCode(), equals() 오버라이드 해야
		
		Map<String, String> map = new HashMap<>();
		
		map.put("luna", "cat");
		map.put("max", "dog");
		map.put("daisy", "cow");
		map.put("toby", "cat");
		map.put("luna", "dog"); // 키 중복 x, 최신값으로 덮어씌워짐
		
		System.out.println(map);
		
		System.out.println(map.get("daisy"));
		
		// 키가 있는지 확인
		System.out.println(map.containsKey("max"));
		
		// 값이 있는지 확인
		System.out.println(map.containsValue("horse"));
		
		// Map의 순회
		// 1. keySet(); 키들의 집합
		for(String key : map.keySet()) {
			System.out.printf("%s : %s \n", key, map.get(key));
		}
		// 2. entrySet(); entry: 키-값의 쌍
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.printf("%s : %s \n", entry.getKey(), entry.getValue());
		}
	}

}
