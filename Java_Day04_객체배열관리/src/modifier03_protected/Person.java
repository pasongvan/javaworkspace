package modifier03_protected;

public class Person {
	
	// 같은 패키지는 오케이
	// 다른 패키지 기본적으로는 불가
	// 다른 패키지 클래스가 상속받았다면 접근 가능
    protected String name;
    protected int age;
    
    public void info() {
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}
