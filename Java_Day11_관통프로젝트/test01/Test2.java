package test01;

import com.google.gson.Gson;

public class Test2 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		String str = "{\"name\":\"Luna\",\"age\":4}";
		
		// 문자열 => 객체 변환 시
		// 자바스크립트: 타입 없음
		// 자바: 타입필요, 타입에 대한 정보를 주어야 함
		Person obj  = gson.fromJson(str, Person.class);
		
		System.out.println(str);
		System.out.println(obj);
		
	}

}
