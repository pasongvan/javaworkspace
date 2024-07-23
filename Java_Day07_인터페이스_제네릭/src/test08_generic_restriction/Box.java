package test08_generic_restriction;

//제네릭 클래스
// < > 안에 타입 파라미터 정해준다.
class Box <T extends Number> { // 숫자만 가능
	private T t;
	
	public T getT() {
		
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Box {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		// Box<String> strBox = new Box<>(); Number로 제한해서 문자열 불가
		
	}
}
