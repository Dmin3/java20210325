package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		
	Malamute d1 = new Malamute();
	d1.bark();
	d1.sit();
	d1.pull();
	
	Pet p1 = d1;
	p1.sit();
//	p1.pull(); 펫타입은 sit메소드만 갖고있기때문에 다른 인터페이스에 있는 기능을 구현못함
	KindaDog k1 = d1;
	
	
	//강제 형변환
	Malamute d2 = (Malamute) k1;
	d2.bark();
	d2.sit();
	d2.pull();
	
	
	Wolf w1 = (Wolf) k1;
	System.out.println("프로그램 종료");
	
	}
}
