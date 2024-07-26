package test02_byte_stream;

import java.io.FileOutputStream;

public class ByteStreamTest2 {
	public static void main(String[] args) {
		// try with resources
		
		try(FileInputStream fis = new FileInputStream("dog.jpg");
			FileOutputStream fos = new FileOutputStream("dog-copy-2.jpg");
			) {
			
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
			System.out.println();
		}
	}
}
