package p06.lecture.p5static;

public class A01InstanceMember {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		
		o1.i = 3;
		o1.method();
		
		MyClass o2 = new MyClass();
		o2.i = 5;
	}
}
