
public class Array05_최대최소합평균 {

	public static void main(String[] args) {
		int[] nums = {53, 211, 11, 66, 84, 132, 12};
		
		// 최대, 최소, 합, 평균
		// 최댓값 구하기:
		// 1. 최댓값을 담을 임시 변수를 아주 작은 값으로 설정 or 첫번재 값
		// 2. 반복만 돌면서 비교한다.
		
		// 최대
		int max = nums[0];
		for (int i=1; i<nums.length; i++) {
			if (nums[i] > max) 
				max = nums[i];
		}
		System.out.println(max);
		
		// 최소
		int min = nums[0];
		for (int i=1; i<nums.length; i++) {
			if (nums[i] < min) 
				min = nums[i];
		}
		System.out.println(min);
		
		// 합
		int sum = 0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		
		// 평균
		double avg = (double)sum / nums.length;
		System.out.println(avg);
	}

}
