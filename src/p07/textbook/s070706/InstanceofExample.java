package p07.textbook.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환 실패");
		}
	}
}
