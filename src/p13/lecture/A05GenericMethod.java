package p13.lecture;

public class A05GenericMethod {
	public static void main(String[] args) {
		
	MyClass5 o1 =new MyClass5();
	o1.<String>method1();
	o1.<String>method2("java"); 
	o1.method2("spring"); // 컴파일러가 string이라는것을 추론을 함 그래서 위에
	// 저런 타입은 거의 볼일이 없을꺼임
	}
}

class MyClass5{
	public <T> void method1() {
		
	}
	public <T> void method2(T param) {
		
	}
}
