package p08.textbook.s080600;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		
		ia.methodA();  //methodA만 호출 가능
		
		InterfaceB ib = impl;
		
		ib.methodB(); //methodB만 호출 가능
		
		InterfaceC ic = impl; // A와B를 상속하기 때문에 메소드 A.B.C 모두 가능
		ic.methodC();
		ic.methodA();
		ic.methodB();
		
		
	}
}
