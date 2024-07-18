package modifier00_jvm_static;

public class PersonTest {
    public static void main(String[] args) {
    	
    	// static 변수 출력
    	System.out.println(Person.pCount);
    	
    	Person p = new Person();
    	p.pCount = 200; // static 변수 모든 인스턴스 공유, 수정 가능
    	System.out.println(p.pCount);
    	// static 변수는 클래스 이름으로 접근하는 것 권장, 위 방법 비추
    }
}
