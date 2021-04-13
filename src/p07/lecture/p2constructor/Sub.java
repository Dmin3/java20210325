package p07.lecture.p2constructor;

public class Sub extends Super {
	// 생성자는 상속되지 않음
	
	public Sub(int i) {
		// 상위 클래스 생성자 호출 방법
//		this.i = i;  -- > x
		super(i);
	}
}
