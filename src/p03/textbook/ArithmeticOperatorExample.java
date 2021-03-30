package p03.textbook;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("결과1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("결과2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("결과3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("결과4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("결과5=" + result5);
		
		double result6 = (double) v1 / v2;
		System.out.println("결과6=" + result6);
	}
}
