package modifier01_private;

public class Person {
	
	// private: 자기 자신만 접근 가능, 클래스 안에서만!
    private String name;
    private int age;
    
    // 멤버 메소드: 자기 자신
    public void info() {
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}
