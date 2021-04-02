package p04.textbook;

public class ForPrintFrom1ToExample {
	public static void main(String[] args) {
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		// 1~10 홀수만
		for(int j = 1; j <= 5; j++) {
			System.out.println(j*2 -1);
		}
		// 1~10 짝수만
		for(int k = 1; k <= 5; k++) {
			System.out.println(k * 2);
		}
		// 10~1
		for(int n = 10; n >= 1; n--) {
			System.out.println(n);
		}
		System.out.println("짝수");
		// 10~1 짝수만
		for(int i = 10; i >= 1; i-=2) {
			System.out.println(i);
		}
			
		// 10~1홀수만
		for(int i = 9; i >= 1; i -= 2) {
			System.out.println(i);
		}
	
	}
}
