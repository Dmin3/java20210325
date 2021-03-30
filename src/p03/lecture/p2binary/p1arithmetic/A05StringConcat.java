package p03.lecture.p2binary.p1arithmetic;

public class A05StringConcat {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		
		int c = a + b;
		System.out.println(c);
		
		//String : 문자열 ""
		String str1 = "java";
		String str2 = "spring";
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = str1 + a;
		System.out.println(str4);
		//숫자와 문자열이 계산될때는 왼쪽부터 계산이 된다.
		
	
	}
}
