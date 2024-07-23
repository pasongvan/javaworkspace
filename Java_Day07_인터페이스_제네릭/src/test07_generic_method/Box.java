package test07_generic_method;

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
		
		intBox.printClassName
		
	}
}
