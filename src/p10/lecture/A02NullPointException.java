package p10.lecture;

public class A02NullPointException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행중...");
		
		String str = "java";
		showLength(str);
	}
	
	
	private static void showLength(String s) {
		System.out.println("길이는" + s.length());
	}
}
