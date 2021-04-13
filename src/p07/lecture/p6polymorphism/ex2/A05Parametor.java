package p07.lecture.p6polymorphism.ex2;

public class A05Parametor {
	public static void main(String[] args) {
		KindaCat k1 = new KindaCat();
		
		method(k1);
	}
	
	public static void method(KindaCat k) {
		k.cry();
	}
}
