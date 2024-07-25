package test02_try_catch;

public class ExceptionTest3 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		// try ... catch ... catch
		// catch문은 여러개가 올 수 있다
		
		try {
			System.out.println("정상 코드1");
			System.out.println(nums[0]); // ArrayIndexOutOfBoundsException
			int i = 1 / 0; // ArithmeticException
			System.out.println("정상 코드2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났어요.");
		} catch (ArithmeticException e) {
			System.out.println("잘못된 계산식입니다.");
		}
		System.out.println("프로그램 종료");
	}

}
