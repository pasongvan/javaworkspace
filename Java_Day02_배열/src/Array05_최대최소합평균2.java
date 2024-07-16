
public class Array05_최대최소합평균2 {

	public static void main(String[] args) {
		int[] nums = {53, 211, 11, 66, 84, 132, 12};
		
		// 최대, 최소, 합, 평균
		// 최댓값 구하기:
		// 1. 최댓값을 담을 임시 변수를 아주 작은 값으로 설정 or 첫번재 값
		// 2. 반복만 돌면서 비교한다.
		
		int max = nums[0];
		int min = nums[0];
		int sum = nums[0];
		
		for (int i=1; i<nums.length; i++) {
			// 최대
			if (nums[i] > max) 
				max = nums[i];
			// 최소
			if (nums[i] < min) 
				min = nums[i];
			// 합 
			sum += nums[i];
		}
		// 평균
		double avg = (double)sum / nums.length;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
	}

}
