package test05_overiding;

// 상속 extends
public class Student extends Person{
	
	String major;
	
	// 아무런 생성자도 정의하지 않은 상태
	// => 컴파일러가 기본생성자 Student() {}를 만들어줌
	// => 생성자는 기본적으로 super(); 있음
	// => 기본적으로 부모클래스의 기본생성자 호출
	
	// 기본생성자 반들기
	// ctrl + spacebar
	// 혹은 우클릭 => Source > Generate Constructor
	public Student() {
		super(); // 안써도 원래 있음
	}
	
	public Student(String name, int age, String major) {
		super(name, age); // 부모의 생성자를 이용해 초기화
		this.major = major;
	}
	
	// 오버라이딩
	// 매소드 이름, 반환형, 매개변수 동일해야
	@Override // 어노테이션으로 명확하게 나타내 주면 좋음 <= 제대로 하고 있는지 알려줌
	void eat() {
		System.out.println("지식을 먹는다.");
	}
	
	
	void study() {
		super.eat();
		System.out.println("공부를 합니다.");
	}

}
