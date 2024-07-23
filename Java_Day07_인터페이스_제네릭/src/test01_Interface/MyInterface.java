package test01_Interface;

// 키워드: interface
public interface MyInterface {

	// 인터페이스에서는 변수 선언 앞 `public static final` 생략
	// 인터페이스의 변수는 상수(static)
	/*public static final*/ int MEMBER_1 = 10;
	
	// 모든 메소드가 추상 메소드
	/* public abstract */ void method1();
	
	default void method3() {
		System.out.println("default mehhod");
	}
	
	static void method4() {
		System.out.println("static method");
	}
}
