package test01_file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		// File: 파일 및 디렉토리 관리
		File f = new File("dog.jpg"); // 상대경로
		System.out.println(f.exists()); // 존재여부
		System.out.println(f.isFile() + "파일 맞음?");
		System.out.println(f.isAbsolute() + "절대경로 맞음?");
		System.out.println(f.getAbsolutePath() + "절대경로 위치");
		System.out.println(f.length() + "bytes");
		
		File src = new File("src");
		System.out.println(src.exists());
		System.out.println(src.isDirectory());
		
		File folder = new File("folder");
		System.out.println(src.exists());
		folder.mkdir();
		
	}
}
