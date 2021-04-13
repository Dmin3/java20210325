package p07.lecture.p6polymorphism.ex2;

public class A08InstanceOf {
	public static void main(String[] args) {
		// instaneceOf : 결과 - boolean
		// 왼쪽 항 참조변수, 오른쪽 항 type
		//참조변수가 가리키는 인스턴스가 오른쪽 항 type이면 true
		// 그렇지 않으면 false
		
		KindaCat k1 = new Tiger();
		System.out.println(k1 instanceof Tiger);
		System.out.println(k1 instanceof KindaCat);
		System.out.println(k1 instanceof Cat);
		
		System.out.println();
		KindaCat k2 = new KindaCat();
		System.out.println(k2 instanceof KindaCat);
		System.out.println(k2 instanceof Tiger);
		System.out.println(k2 instanceof Cat);
		
		Tiger t1 = (Tiger) k1;
		if(k1 instanceof Cat) { //boolean타입
			Cat c1 = (Cat) k1;   // 안전한 코드인지 확인하는법
			
		}
		
		
		
		System.out.println("프로그램 종료");
	}
}
