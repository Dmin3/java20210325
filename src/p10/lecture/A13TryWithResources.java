package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A13TryWithResources {
	public static void main(String[] args) {
		String path = "src/p1/lecture/A13TryWithResources.java";
		try {
		FileInputStream fis = new FileInputStream(path);
	} catch(FileNotFoundException e) {
		
	}
	}	
}
