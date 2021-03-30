package p11.lecture.string;

public class A02Length {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		
		int a = str1.length(); // 변수타입을 int나 더 큰값으로 바꿔줘야댐
		System.out.println(a);
		
		//문제1 마지막 한글자를 뽑고싶다면 ?
		
		String s1 = str1.substring(18, 19);
		System.out.println(s1);
		
		String s2 = str1.substring(a-1, a);
		System.out.println(s2);
	}
}
