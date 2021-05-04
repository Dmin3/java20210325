package p18.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A26HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A26HandleException.java";
		// 트라이문 안에서 선언과 동시에 사용하면 닫을때 문제가 생김
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
				fis.close(); // 로컬변수는 초기화해야댐
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
