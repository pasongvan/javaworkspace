package modifier05_getter_setter;

public class Person {
	
	// 기본적으로 멤버변수는 private - 데이터 보안을 위해
    private String name;
    private int age;
    private boolean hungry;
    
    // 객체지향 방식(캡슐화) 설계
    // 변수에 접근하는 통로는 메소드를 통해 만들고
    // 메소드는 public으로 열어둔다.
    
    // 접근자(getter): 현재 객체의 멤버변수 값 반환
    // 설정자(setter): 현재 객체의 멤버변수 값 변경 <= 새로운 값은 매개변수로 받는다.
    
    // 접근자
    public int getAge() {
    	return age;
    }
    
    //설정자
    public void setAge(int age) {
    	// 검사 로직 추가
    	if (age<0) {
    		System.out.println("나이 음수 불가.");
    		return; // 함수 여기서 종료, 호출한 곳으로 돌아감
    	}
    	this.age = age;
    }
}
