package test02_try_catch;

public class ExceptionTest1 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		// try ... catch
		
		// 1. 예외 발생, 성공적 처리 => 1 2 4 5
		// 2. 예외 발생, 성공적 처리x => 1 (비정상적종료)
		// 3. 예외 미발생 => 1 2 3 5
		
		try {
			System.out.println("정상 코드1"); // (1) 정상코드
			System.out.println(nums[0]); // (2) 예외 발생 가능 코드
			System.out.println("정상 코드2"); // (3) 정상코드
		} catch (ArithmeticException e) {
			System.out.println("배열의 인덱스 범위를 벗어났어요."); // (4) 예외처리 코드
		}
		System.out.println("프로그램 종료"); // (5) 외부 정상코드
	}

}
