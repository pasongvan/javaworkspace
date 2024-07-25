package test04_finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// try ~ catch ~ finally => try with resources
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test.txt"); // 블록 안에서만 사용 가능
		} catch (FileNotFoundException e) {
			System.out.println("예외 발생");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try(FileInputStream fis2 = new FileInputStream("test.txt")) {
			// 메인 로직 작성
		} catch (IOException e) {
			System.out.println("예외 발생");
		}
	}

}
