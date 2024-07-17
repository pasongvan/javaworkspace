package class01;

public class PersonTest {

	public static void main(String[] args) {
		String yang_name = "Yang";
		int yang_age = 45;
		String yang_hobby = "YouTube";
		
		String hong_name = "Hong";
		int hong_age = 25;
		String hong_hobby = "Golf";
		
		// 변수가 너무 많음 => 배열로
		int SIZE = 2;
		String[] names = new String[SIZE];
		int[] ages = new int[SIZE];
		String[] hobbies = new String[SIZE];
		
		names[0] = "Yang";
		names[1] = "Hong";
		ages[0] = 45;
		ages[1] = 25;
		hobbies[0] = "YouTube";
		hobbies[1] = "Golf";
		}

}
