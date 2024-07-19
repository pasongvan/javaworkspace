package test01_class_diagram;

// 하나의 파일에 여러 개의 class를 만들 수 있다.
// 단, public class는 한개만!
// public 클래스의 이름==파일이름

class B {
	
}

class C {
	A a;
}

class D {
	
}

class E {
	
}

class F {
	void method() {
		System.out.println("f");
	}
}

public class A {
	B b; // class A와 B는 연관
	C c; // A, C 양방향 연관
	D[] d; // 집합: A는 D의 집합을 가지고 있다 => A는 D 없이도 존재 가능
	E[] e; // 구성: A는 E로 구성된다 => A는 E 없이 존재 불가
	
	void method() {
		F f = new F(); // A는 F에 의존
		f.method();
	}
}







