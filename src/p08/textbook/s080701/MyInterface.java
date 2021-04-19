package p08.textbook.s080701;

public interface MyInterface {
	public default void method1() {
		System.out.println("myinterface=method1");
	}
		
	public default void method2() {
		System.out.println("myinterface-method2");
	}
}
