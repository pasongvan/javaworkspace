package class08;

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog("매리", 4);
		System.out.println(d.name);
		System.out.println(d.age);
		
		Dog d2 = new Dog();
		d2.eat().drink(); // 매서드 채이닝 
	}
}
