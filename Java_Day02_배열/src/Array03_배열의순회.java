import java.util.Arrays;

public class Array03_배열의순회 {

	public static void main(String[] args) {
		int[] nums = {23, 7, 20, 11, 6};
		
		// index를 활용할 일이 있을 때
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		// for-each 문
		// read only
		for (int num : nums) {
			System.out.println(num);
		}
		
		// 배열 출력
		System.out.println(Arrays.toString(nums));
	}

}
