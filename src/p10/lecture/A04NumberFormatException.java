package p10.lecture;

public class A04NumberFormatException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
		
		String str1 = "100a";
		int int1 = Integer.parseInt(str1); // 숫자로 변환
		
		int result = int1 * 2;
		
		System.out.println(result);
		
		System.out.println("프로그램 종료.");
		
		// 오류뜨는 메세지만 봐도 힌트는 다있음.
	}
}
