package test01_Interface;

public class Test {
	public static void main(String[] args) {
		
		// 인터페이스로 객체 생성 불가!
		// MyInterface mi = new MyInterface();
		
		MyClass m = new MyClass();
		
		m.method1();
		
		m.method3();
		
		MyInterface.method4();
		
		// 1. default 메소드끼리 겹친다면?
		// => 구현 클래스에서 오버라이드 해야 함, 선택 or 수정
		
		// 2. default 메소드와 상위클래스 메소드가 겹치는 경우
		// A extends B implements C
		// 기본적으로는 상위 메소드 사용!
		// 오버라이드를 통해 재정의 가능
		
		
		
		
	}
}
