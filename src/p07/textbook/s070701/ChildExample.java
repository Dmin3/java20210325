package p07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); // 오버라이딩 된 값을 출력된다 중요한점
		
//		parent.method3(); -- > 호출 불가능
				
	}
}
