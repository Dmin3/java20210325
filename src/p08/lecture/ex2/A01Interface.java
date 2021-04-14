package p08.lecture.ex2;

public class A01Interface {
	public static void main(String[] args) {
		System.out.println(MyInterface.My_FIELD1);
		System.out.println(MyInterface.MY_FIELD2);
		
		MyInterface.staticMethod1(); // 스태틱메소드는 인스턴스가 없어도 접근가능
		MyInterface.staticMethod2();
		
		MyClass c1 = new MyClass();
		c1.method();
		c1.method1();
		c1.defaultMethod1();
		c1.defaultMethod2();
	}
}
