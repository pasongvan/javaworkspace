package test02_try_catch;

public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		// try ... catch ... catch
		// catch문은 여러개가 올 수 있다
		
		try {
			System.out.println("정상 코드1");
			System.out.println(nums[0]); // ArrayIndexOutOfBoundsException
			int i = 1 / 0; // ArithmeticException
			System.out.println("정상 코드2");
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("둘 중 한 예외 발생.");
		}
		System.out.println("프로그램 종료");
	}

}
