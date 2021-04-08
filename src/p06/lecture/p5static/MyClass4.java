package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
	
	static int a = 30;
	static int b;
	
	//스택 블럭은 클래스가 실행될때 실행이 된다.
	static {
		b = 50;
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block2");
	}
	
	MyClass4() {
		// 인스턴스 필드 초기화
		this.j = 5;
	}
}
