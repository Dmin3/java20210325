package p08.lecture.ex2;

public interface MyInterface {
	// 필드 만들수 있음
	// 만드는 모든 필드는 public static final 필드만 만들수 있음
	
		public static final int My_FIELD1 = 1; // 최종 값만 넣어줘야댐
		int MY_FIELD2 = 2; 
		String MY_FIELD3 = "HELLO";
	
	
	// 메소드 만들수 있음
	
	// public abstract 메소드 (인스턴스 메소드) 얘가 제일 중요
		public abstract void method1(); // abstract 이기때문에 몸통이 있으면 안됌
		void method(); // interface에서는 생략해도 컴퓨터가 인지한다
	// public static 메소드 (클래스 메소드)
		public static void staticMethod1() {
			System.out.println("static method1");
		}
		static void staticMethod2() {
			System.out.println("static method2");
		}
	// public default 메소드 (인스턴스 메소드)
		public default void defaultMethod1() {
			System.out.println("default method1");
		}
		default void defaultMethod2() {	// default 키워드를 안붙히면 추상메소드를 읽기때문에 꼭 붙히자 (몸통 있어야댐)
			System.out.println("default method2");
		}
}
