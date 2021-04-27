package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A16Throws {
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
		method1();
	}
	private static void method1() throws ClassNotFoundException, FileNotFoundException { // throws 키워드 중복허용
		Class.forName("java.lang.Number");
		FileInputStream fis = new FileInputStream("");
	}
}
