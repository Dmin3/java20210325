package p11.lecture.string;

public class A01SubString {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		String s1 = str1.substring(0, 4); // 스트링을 뽑아되는 방법
		System.out.println(s1);
		
		String s2 = str1.substring(5, 12);
		System.out.println(s2);
		
		String s3 = str1.substring(13, 19);
				System.out.println(s3);
	}
}
