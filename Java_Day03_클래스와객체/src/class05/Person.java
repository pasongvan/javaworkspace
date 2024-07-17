package class05;

// 클래스 생성: class 키워드 이용
// class 클래스이름 {}
class Person {
	// 데이터
	// 멤버 변수
	String name;
	int age;
	String hobby;
	
	// 멤버 메서드
	// 관련된 데이터와 로직을 하나로 묶어준다.
	// 멤버 변수 매개변수르 넘기지 않아도 됨
	// static: 클래스
	void info() {
		System.out.println("이름은 "+name+", 나이는 "+age+", 취미는 "+hobby);
	}
}
