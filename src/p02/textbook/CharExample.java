package p02.textbook;

public class CharExample {
	public static void main(String[] args) {
				char c1 = 'A';
				char c2 = 65;
				char c3 = '\u0041';
				
				System.out.println(c1); // 문자로 직접 출력
				System.out.println(c2); // 10진수로 출력
				System.out.println(c3); // 16진수로 출력
				int unicode = c1; //유니코드 얻기
				char c4 = '가';
				char c5 = 44032;
				char c6 = '\uac00';
				System.out.println(c4);
				System.out.println(c5);
				System.out.println(c6);
				System.out.println(unicode);
	}
}
