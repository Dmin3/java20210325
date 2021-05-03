package p18.lecture;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class A18FilterStream {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output8.txt";
		OutputStream os = getOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		osw.write('a');
		osw.write('가'); // 1byte가 넘기때문에 안나옴
		osw.write('b');
		
		osw.close();
		os.close();
	}
	
	public static OutputStream getOutputStream(String file)
	throws Exception{
		return new FileOutputStream(file);
	}
}
