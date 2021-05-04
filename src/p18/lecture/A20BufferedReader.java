package p18.lecture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class A20BufferedReader {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/A20BufferedReader.java";
		Reader rd = new FileReader(path);
		BufferedReader br = new BufferedReader(rd);
		
		System.out.println((char)br.read());
		System.out.println((char)br.read());
		
		// rearLine : 한 줄씩 읽는 메소드
//		 마지막에 도달했을때는 null을 리턴
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		
		
		String line = null;
		
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		
		rd.close();
		br.close();
	}
}
