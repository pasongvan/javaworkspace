package class05;

public class PersonTest {

	public static void main(String[] args) {
		// 클래스를 가지고 객체를 생성
		// 클래스이름 객체의변수이름 = new 클래스이름();
		Person yang = new Person();
		
		// . (이 객체가 가지고 있는)
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		
		yang.info();
		hong.info();
		
	}
}
