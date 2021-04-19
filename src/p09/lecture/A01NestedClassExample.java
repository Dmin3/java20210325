package p09.lecture;

import p09.lecture.A01NestedClass.InnerClass;

public class A01NestedClassExample {
	public static void main(String[] args) {
		A01NestedClass.StaticClass o1 = new A01NestedClass.StaticClass();
//		A01NestedClass.InnerClass o2 = new A01NestedClass.InnerClass();
		
		A01NestedClass outer1 = new A01NestedClass();
		A01NestedClass.InnerClass o3 = outer1.new InnerClass();
	}
}
