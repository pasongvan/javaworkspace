package test08_comparable;

// 사용자 정의 클래스 정렬을 위해
// 비교 기준 필요
// Comparble 인터페이스 구현
//    => 제네릭: 타입 매개변수에 비교하고자 하는 클래스 타입을 넣는다
public class Person implements Comparable<Person>{
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
	

	@Override
	public int compareTo(Person o) {
		// 1. 나이 기준 비교
		// return this.age - o.age; // this.age가 더 크면 양수 => 자리 바꿈 => 오름차순
//		return o.age - this.age; // o.age가 더 크면 양수 => 자리 바꿈 => 내림차순
		
		// 2. 이름 기준 비교
//		return this.name.compareTo(o.name);
		
		// 3. 1순위 나이, 2순위 이름
		if (this.age==o.age) {
			return this.name.compareTo(o.name); // *-1 해주면 역순
		}
		return this.age - o.age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
