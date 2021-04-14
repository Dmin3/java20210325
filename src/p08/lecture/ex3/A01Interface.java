package p08.lecture.ex3;

public class A01Interface {
	public static void main(String[] args) {
		Malamute p1 = new Malamute();
		Pet d1 = p1; // 말라뮤트에 인터페이스 값이기때문에 참조값이 같음
						// 즉 타입을 바꿔도 써도 사용가능하다는점
		d1.sit();
		
		SledDog s1 = p1; // 이하동일
		s1.pull();
	}
}
