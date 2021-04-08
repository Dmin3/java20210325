package p06.lecture.p4method;

public class MyClass9 {
	void method() {
		System.out.println("method!!!");
	}
	void method(int i) {       // 위에 메소드랑 서로 다른 메소드가 되었다 파라미터때문에
		System.out.println("method");
	}
	
	void method(int i, int j) {
		System.out.println("method(int, int)");
	}
	
	void method(int i, String s) {
		System.out.println("sdadad");
	}
	// 메소에 이름이 같아도 파라미터에 타입과 갯수 순서가 다르면
	// 서로 다른 메소드가 된다
	void method(String i, int s) {
		System.out.println("sdsad");
	}
	
	void method(double i) {
		System.out.println("method(double)");
	}
}
