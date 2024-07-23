package test01_Interface;

// 인터페이스는 그 자체로 객체 생성 불가
// 반드시 일반 클래스에 의해 구현되어야
// 구현: 클래스 implements 인터페이스
// 상속: 클래스 extends 상위클래스
//		인터페이스 extends 인터페이스
public class MyClass implements MyInterface{
	// 1. 인터페이스의 모든 추상메소드를 재정의
	// 2. 추상 클래스로 남는다.

	@Override
	public void method1() {
		System.out.println("method1");
		
	}
	
}
