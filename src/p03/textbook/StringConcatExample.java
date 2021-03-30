package p03.textbook;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; // jdk6.0
		String str2 = str1 + "특징"; // jdk6특징
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //jdk33.0
		String str4 = 3 + 3.0 + "JDK"; //6jdk
		System.out.println(str3);
		System.out.println(str4);
		
		//계산 순서에 따라 숫자와 문자열이 출력되는 값이 달라질수 있다.
	}
}
