package p18.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class A02InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputSteam.java";
		InputStream is =new FileInputStream(fileName);
		
//				int b1 = is.read(); // 첫번째 byte를 읽어냄
//				int b2 = is.read();
//				System.out.println(b1);
//				System.out.println(b2);
		int b = 0;
		int cnt = 0;
		while((b = is.read()) != -1) {
			System.out.println(++cnt);
		}
		
				is.close();
	}
}
