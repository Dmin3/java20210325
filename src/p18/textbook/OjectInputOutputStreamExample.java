package p18.textbook;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/Object.dat";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		
	}
}
