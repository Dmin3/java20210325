package p18.lecture;

import java.io.FileInputStream;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class A19BufferedStream {
	public static void main(String[] args) throws Exception{
		String file = "src/p18/lecture/A19BufferedStream.java";
		FileInputStream fis = new FileInputStream(file);
		
		int b = 0;
		long start = System.nanoTime();
		while((b = fis.read()) != -1) {
			
		}
		long end = System.nanoTime();
		
		System.out.println(end - start);
		
		fis.close();
	}
}
