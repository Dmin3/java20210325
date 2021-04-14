package p08.lecture.ex1;

public class A01Interface {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Malamute d1 = new Malamute();
		
		KindaCat k1 = c1; 	// 적용 가능
		Pet p1 = c1;	// 적용 가능
		p1.sit();
		KindaDog k2 = d1; // 적용 가능 
		
		Pet p2 = d1;  // 적용가능 이유 : 다형성을 이용하여 타입이 달라도 공통을 갖고있기때문에 가능함
		p2.sit();
//		Pet p2 = new Pet();  추상적 개념이기때문에 생성이 안됌
	}
}
