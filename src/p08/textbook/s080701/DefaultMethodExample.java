package p08.textbook.s080701;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyInterface mil = new MyClassA();
		mil.method1();
		mil.method2();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}
}
