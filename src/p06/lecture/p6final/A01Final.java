package p06.lecture.p6final;

public class A01Final {
	public static void main(String[] args) {
		// final 변수 ( 지역변수, 파라미터, 필드 )
		// 값을 한 번만 할당 받을 수 있음.
		
		final int i;
		int j;
		
		j=3;
		j=5;
		i=9;
//		i=10;
		
	}
	static void method1(final int i) {
		System.out.println(i);
		
		
	}
}
