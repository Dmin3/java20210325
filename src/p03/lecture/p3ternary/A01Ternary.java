package p03.lecture.p3ternary;

public class A01Ternary {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항
		// 결과는 1항이 true -->  2항 
		// 				false --> 3항
		boolean b = true;
		// b ? 3 : 4 0-----> 결과가 3
		
		System.out.println(b ? 3 : 4);
		
		b = false;
		System.out.println(b ? 3 : 4);
		
		int a = 5;
		
		// (a > 0) ? "양수" : "음수 또는 0"
		
		String s = (a > 0) ? "양수" : "음수 또는 0";
		System.out.println(s);
	}
}
