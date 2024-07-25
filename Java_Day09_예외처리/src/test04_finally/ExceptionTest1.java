package test04_finally;

public class ExceptionTest1 {
	public static void main(String[] args) {
		
		// try ... catch ... finally
		// 1. 정상 실행: 1 2 4 5
		// 2. 예외 발생, 처리 됨: 1 3 4 5
		// 3. 예외 발생, 처리 x: 1 4 (비정상 종료)
		// 4. 정상 실행, return이 있는 경우: 1 2 4 <= finally는 무조건 실행
		// 5. 예외 발생, 처리, catch문 return: 1 3 4 
		
		int[] nums = {10};
		
		try {
			System.out.println("1");
			nums[3] = 40;
			System.out.println("2"); 
//			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3");
			return;
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}

}
