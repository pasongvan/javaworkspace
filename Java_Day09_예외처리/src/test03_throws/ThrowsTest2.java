package test03_throws;

public class ThrowsTest2 {

	// UncheckedException
	//	UncheckedException에게 throws는 아무런 의미가 없다.
	//	throws: 이번만 한 번 봐줄게
	//	Unchecked: 원래 봐줌
	
	public static void main(String[] args) {
		method1();

	}

	public static void method1() {
		try {
			method2();
		} catch(ArithmeticException e) {
			System.out.println("method 1에서 처리합니다");
		}
		
	}

	public static void method2() {
		int i = 1 / 0; //ArithmeticException - UncheckedException
		
	}

}
