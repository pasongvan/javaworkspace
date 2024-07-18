package modifier00_jvm_static;

public class Person {
	// static 변수
	// 클래스에 이미 들어있는 변수
	// 인스턴스 생성과 무관 => 모든 인스턴스가 공유
	// 설계도가 메소드 영역에 로딩되는 시점에 만들어짐
	// 사용: Person.pCount
	static int pCount = 100;
	
	// static 초기화 블록
	static {
		pCount = 1000;
	}
	

	// non-static
	// 인스턴스 변수, 멤버 변수
	// 인스턴스 생성 시  => 힙 영역에 만들어진다.
    String name;
    int age;
    String hobby;
    
    // static 메소드 (설계도)
    public static void main(String[] args) {
		// name = "Kim"; // non static에 대한 접근 불가
	}
    
    // non-static 메소드
    public void info() {
    	pCount = 300; // static 접근 가능
    }
}
