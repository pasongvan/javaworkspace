package test06_delete_method;

public class Test {
    public static void main(String[] args) {
    	Animal[] animals = new Animal[3];
    	
    	animals[0] = new Cat("Luna", 3);
    	animals[1] = new Dog("Max", 4);
    	animals[2] = new Cow("Daisy", 2);
		
		for (Animal animal : animals) {
			animal.eat();
			animal.speak();
		}
		
		// 코드 중복 줄이기 성공!
		// 아직 상속 이후 쓰이지 않는 코드가 있음..
		// .speak의 경우 자식클래스에서 모두 override 됨
		// 부모 클래스에서 굳이 필요없음
    }
}
