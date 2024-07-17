package class08;

class Dog {
	String name;
	int age;
	
	// 생성자를 하나라도 만든다면
		// 기본생성자 자동 추가 안됨
		// 기본 생성자는 웬만하면 만드는게 좋음
		Dog() {
			
		}
	
	// 생성자에도 매개변수가 올 수 있다.
	// 생성자: 멤버필드를 초기화하는데 사용.
	Dog(String name, int age) {
		// this.를 통해 구별한다.
		// this. : 생성된 인스턴스가 가지고 있는
		this.name = name;
		this.age = age;
	}
	
	Dog(String name) {
		// this.를 통해 구별한다.
		// this. : 생성된 인스턴스가 가지고 있는
//		this.name = name;
//		this.age = 5;
		this(name, 5); // 내가 이미 가지고 있는 생성자 호출
		// 제약사항: 반드시 생성자 본문에서 첫줄에 위치!!!!!!!
	}
	
	Dog(int age) {
		this("unknown", age);
	}
	
	// 매서드 chaning
	Dog eat() {
		System.out.println("사료를 먹고....");
		return this;
	}
	void drink() {
		System.out.println("물 마십니다.");
	}
}
