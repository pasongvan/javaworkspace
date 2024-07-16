import java.lang.reflect.Array;
import java.util.Arrays;

public class Array07_2차원배열선언및생성 {

	public static void main(String[] args) {
		int[][] arr1; // 선언만
		
		int[][] arr2 = new int[3][4]; // 3x4 배열
		
		// 다차원배열 출력
		// Arrays.deepToString()
		System.out.println(Arrays.deepToString(arr2));
		
		// 2차원 배열을 생성할 때는 2차원 배열의 길이만 지정하면 된다.
		// 2차원 배열: 1차원 배열의 참조값을 요소로 갖는 배열
		int[][] arr3 = new int[3][];
		System.out.println(Arrays.deepToString(arr3));
		arr3[0] = new int[10];
		arr3[1] = new int[4];
		arr3[2] = new int[9];
		System.out.println(Arrays.deepToString(arr3));
	}
}
