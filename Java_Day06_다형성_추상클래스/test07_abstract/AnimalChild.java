package test07_abstract;

// 추상 클래스의 자식 클래스는
// 1. 모든 추상 메소드를 오버라이드하든지 => 일반 클래스이므로 객체 생성 가능
// 2. 오버라이드 하지 않으면 => 자식 클래스도 추상 클래스
public abstract class AnimalChild extends Animal{
	public AnimalChild(String name, int age) {
		super(name, age);
	}

}
