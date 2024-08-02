package test01;

import com.google.gson.Gson;

public class Test1 {
	// 프로젝트에 Gson 라이브러리 인식시키는 방법
	// 1. JRE System. Library 폴더에 jar 파일 복붙 <- 비추
	
	// 2. 프로젝트 외부에 있는 jar 파일을 링크로 연결
	//	=> 단점 프로젝트 옮기면 링크 깨져서 인식x
	
	// 3. 프로젝트 내부로 jar 파일 복사
	//	- 프로젝트 우클릭 -> Build Path -> Configure Build Pats
	//		-> 라이브러리탭 -> ADD Jars
	// 	-수동: 의존성 해결을 직접 해줘야
	
	// 4. Maven 프로젝트로 만들고 pom.xml에 dependencies에 추가
	public static void main(String[] args) {
		Gson gson = new Gson();
		// 자바에서 객체를 => JSON 문자열
		// 		  JSON 문자열 => 객체
		
		// 자바스크립트에서는 클래스 없이 객체를 만들었지만
		// 자바에서는 클래스를 미리 만들어줘야한다.
		Person luna = new Person("Luna", 4);
		
		String lunaStr = gson.toJson(luna);
		
		System.out.println(luna);
		System.out.println(lunaStr);
	}

}
