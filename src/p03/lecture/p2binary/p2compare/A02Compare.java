package p03.lecture.p2binary.p2compare;

public class A02Compare {
	public static void main(String[] args) {
		double d = 3.0;
		int i = 3;
		
		System.out.println(3.0 == 3);
		
		// 실수 끼리 연산주의
		
		double e = 0.1; // 이진법으로 무한한 소수점으로
		float f = 0.1F;
		
		System.out.println(e == f);
	}
}
