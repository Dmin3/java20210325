package p08.lecture.ex6;

public class A01Anonymous {
	public static void main(String[] args) {
		
		
		// 클래스와 인스턴스를 한번에 만듬
		// 무명클래스(anonymous class) , 익명클래스
		MyInterface i2;
		i2 = new MyInterface() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("anonymous class");				
			}
		};
		
		i2.method1();
	
		
	}
}
