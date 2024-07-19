package test04_super;

// public class Person extends Object {
public class Person {
	String name;
	int age;
	
	// 부모 클래스에서 매개변수가 있는 생성자를 만들었더니
	// 기본 생성자가 없어지면서
	// 다른데서 에러 뜸!
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 그래서 기본 생성자를 만들어줘야.
	public Person() {}
	
	void eat() {
		System.out.println("음식을 먹습니다.");
	}

}
