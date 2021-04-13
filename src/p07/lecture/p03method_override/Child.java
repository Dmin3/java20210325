package p07.lecture.p03method_override;

public class Child extends Parent {
	@Override     // @를 붙어서 실수를 방지 할수있음
				// annotation	
	public void method1() {
		// 재정의 가능한다는거 (메소명과 파라미터 조합도 같아야댐)
		super.method1(); // 위치가 첫번째줄일 필요는 없음 (생성자와 다름)
		System.out.println("method1 - child");
	}
}
