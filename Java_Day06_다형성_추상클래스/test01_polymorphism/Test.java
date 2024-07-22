package test01_polymorphism;

public class Test {
    public static void main(String[] args) {
    	// 다형성
    	// 1. 상속 관계에 있을 때,
    	//	  조상 크래스의 타입으로, 자손 클래스의 객체를 참조할 수 있다.
    	Student st = new Student();
    	Person p = new Student();
    	Object obj = new Student(); // Object는 모든 클래스의 조상 클래스!
    	
    	//st. //
    	//p. // 부모 클래스에서 정의된 메소드, 변수만 접근 가능
    	// 그래도 생성된 인스턴스 자체는 변함 없음
    	// 접근 범위만 변화
    	
    	// 2. 동적 바인딩
    	//	  자손 클래스에서 오버라이드 했을 때,
    	//	  타입과 관계없이 인스턴스가 가진 메소드 호출
    	st.eat();
    	p.eat(); // 자손클래스에서 오버라이드 한 메소드가 적용됨
        
    }
}
