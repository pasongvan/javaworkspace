package test05_object_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest3 {

	public static void main(String[] args) {
		// 파일 => 객체
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("luna.dat"))) {
			
			Object obj = ois.readObject();
			System.out.println(obj);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
