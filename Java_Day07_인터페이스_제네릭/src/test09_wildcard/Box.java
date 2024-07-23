package test09_wildcard;

//제네릭 클래스
// < > 안에 타입 파라미터 정해준다.
class Box <T> { // 숫자만 가능
	private T t;
	
	public T getT() {
		
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Box {
	public static void main(String[] args) {
		Box<?> parent = new Box<Integer>();
		Box<? extends Integer> a = new Box<Integer>();
		Box<? super Double> b = new Box<Object>();
		
	}
}
