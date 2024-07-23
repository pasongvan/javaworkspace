package test06_generic_box;

//제네릭 클래스
// < > 안에 타입 파라미터 정해준다.
class Box <T> {
	private T t;
	
	public T getT() {
		
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Box {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<Integer>();
		Box<String> strBox = new Box<>(); // 호출 부분 타입 생략 가능
		Box<Double> doubleBox = new Box<>();
		
		intBox.setT(43); // 타입 안정성 높여줌
		strBox.setT("Hello");
		String value = strBox.getT(); // 형변환 필요 없음
		
		// 제네릭에서 타입을 쓸 때 = > 클래스로 써줘야 함
		// Box<int> intBox = new Box<int>(); <= 안됨
		// 기본형: int, double, char, boolean => Wrapper 클래스 사용해야
		
		// int 변수와 Integer 클래스
		int i1 = 11; 
		Integer i2 = 11; // autoboxing: 기본형 값을 => 객체
		Integer i3 = Integer.valueOf(123); // boxing (매소드 활용)
		int i4 = i2; // auto unboxing
		int i5 = i3.intValue();
		
	}
}
