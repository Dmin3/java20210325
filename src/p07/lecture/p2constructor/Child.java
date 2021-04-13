package p07.lecture.p2constructor;

public class Child extends Parent {
	
//	public Child() {
//		super(1); // 상위클래스에 파라미터 없는 클래스가 없음
//	}
	public Child(int i, int j) {
		super(i);
		this.j = j;
	}
}
