package test02_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest1 {

	public static void main(String[] args) {
		// byte stream을 이용해 이미지 입출력
		// stream => close() => finally
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("dog.jpg");
			fos = new FileOutputStream("dog-copy.jpg");
			
			int b; // 바구니
			
			while((b=fis.read()) != -1) { // 하나의 바이트를 읽어와서, 있다면
				fos.write(b); // 하나의 바이트 출력스트림에 쓴다.
				
			}
			System.out.println("복사 끝");
					
		} catch (IOException e) {
			
		} finally {
			try {
				if(fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
