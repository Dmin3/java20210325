package p05.lecture;

import java.util.Arrays;

// 08 그림
public class A22ArrayCopyRefType {
	public static void main(String[] args) {
		String[] s = {"java", "abc"}; // 배열이 스트링이니 타입도 스트링
		String[] t = new String[2];
		
		System.arraycopy(s, 0, t, 0, 2);
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		
		
	}
}
