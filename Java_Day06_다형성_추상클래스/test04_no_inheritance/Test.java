package test04_no_inheritance;

public class Test {
	public static void main(String[] args) {
		Cat luna = new Cat("Luna", 3);
		Dog max = new Dog("Max", 4);
		Cow daisy = new Cow("Daisy", 2);
		
		luna.eat();
		luna.speak();
		max.eat();
		max.speak();
		daisy.eat();
		daisy.speak();
		
		// => 다형성 이용 => 코드 중복 줄이기
	}
}
