package p08.lecture.ex2;

public class MyClass implements MyInterface { // 추상메소드를 썼기때문에 책임을 지고 구현을 해야됌 아니면 실행불가
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("method");
	}
	@Override
		public void method1() {
			// TODO Auto-generated method stub
			System.out.println("method1");
		}
	// 인터페이스 구현하면 이미 default method를 갖고있음 (쓰지 않아도 갖고있음)
}
