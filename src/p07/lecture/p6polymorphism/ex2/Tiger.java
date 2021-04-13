package p07.lecture.p6polymorphism.ex2;

public class Tiger extends KindaCat {

		@Override // 메소드 재정의
		public void cry() {
			System.out.println("어흥!!!!");
		}
		public void hunt() {
			System.out.println("호랑이가 사냥합니다");
		}
}
