package test07_sort;

public class Person {
	String name;
	int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		// 일반적으로 String은 같은 문자열에 대해 같은 해시코드가 나옴
		// name의 해시코드만 사용해서 구별하자!
		return name.hashCode();
	}
	
	// 매개변수와 같으면 true, 아니면 false
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) { // 비교하고자 하는 obj가 Persone 타입이라면
			Person p = (Person) obj;
			return this.age == p.age;
		}
		// Person이 아니라면
		return false;
	}
	
	
}
