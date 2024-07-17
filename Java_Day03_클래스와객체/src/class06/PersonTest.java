package class06;

public class PersonTest {

	public static void main(String[] args) {
		Person p =new Person();
		
		p.study(10);
		// 묵시적 형변환 가능.
		p.study((short) 10);
		p.study('a');
		
		// 매서드 오버로딩
		p.study(10L);
		p.study(10.5);
		p.study("ten");
		
	}
}
