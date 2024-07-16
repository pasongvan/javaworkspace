
public class Array08_2차원배열실습 {

	public static void main(String[] args) {
		int[][] grid = {
				{2, 3, 1, 4, 7},
				{8, 13, 3, 33, 1},
				{7, 4, 5, 80, 12},
				{17, 9, 11, 5, 4},
				{4, 5, 91, 27, 7},
		};
		// 방법 1
		int sum = 0;
		int cnt = 0;
		for (int r=0; r<grid.length; r++) { // grid.length 2차원 배열의 길이
			for (int c=0; c<grid[r].length; c++) { //grid[r].length 1차원 배열의 길이
				if(grid[r][c] % 3 == 0) {
					sum += grid[r][c];
					cnt++;
				}
			}
		}
		System.out.println(sum);
		System.out.println(cnt);
		
		// 방법 2
		sum = 0;
		cnt = 0;
		for (int r=0; r<grid.length; r++) { // grid.length 2차원 배열의 길이
			for (int c=0; c<grid[r].length; c++) { //grid[r].length 1차원 배열의 길이
				if(grid[r][c] % 3 != 0) continue;  
				sum += grid[r][c];
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(cnt);
	}

}
