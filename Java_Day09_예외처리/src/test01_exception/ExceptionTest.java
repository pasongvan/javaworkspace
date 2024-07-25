package test01_exception;

public class ExceptionTest {

	public static void main(String[] args) {

		// 1. Unchecked Exception
		//	컴파일 성공
		//	RuntimeException의 자손들
		int[] nums = {10};	
		System.out.println(nums[2]);

		// 2. Checked Exception
		// 	빨간 줄
		// 	컴파일 실패 => 실행 불가
		//	Exception 자손들, RuntimeException의 자손은 아닌
//		Class.forName("Hello"); // 해당 이름의 클래스가 있다면 메모리 로드
//		Thread.sleep(1000); // 일시정지
	}

}
