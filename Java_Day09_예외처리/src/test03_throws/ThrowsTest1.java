package test03_throws;

public class ThrowsTest1 {

	// CheckedException과 throws
	// 	CheckedException: 예외 처리 강제
	// 	선택지 2가지
	//	1. try-catch
	//	2. throws로 전달
	//		throws의 의미
	//		1) 미안.. 내가 처리 안할게..
	//		2) checkedException을 발생시킬 수 있음을 알고
	//		   => 예외처리 해야겠군
	// main 메소드에서 throw? 예외처리 안되고 남음
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void method1() throws ClassNotFoundException {
		method2();
	}

	private static void method2() throws ClassNotFoundException {
		Class.forName("Hello"); // CheckedException 발생
		
	}

}
