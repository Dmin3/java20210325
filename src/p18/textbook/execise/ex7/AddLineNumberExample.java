package p18.textbook.execise.ex7;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/execise/ex7/AddLineNumberExample.java";
		
		// 작성위치
		FileReader is = new FileReader(path);
		BufferedReader br = new BufferedReader(is);
		
		int lineNumber = 0; // while 돌아가는동안 라인 출력
		String lineData;
		while((lineData = br.readLine()) != null) {
			System.out.println(++lineNumber +":"+ lineData);
		}
		
		
		is.close();
		br.close();
		
		
	}
}
