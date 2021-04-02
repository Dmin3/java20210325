package exerice;

public class pratice {
	public static void main(String[] args) {
		//1~10 홀수의 합
		int x = 0;
		for(int i = 1; i <= 10; i += 2) {
			x += i; 
		}
		System.out.println("홀수의 합은 ?" + x);

		//1~10 짝수의 합
		int k = 0;
		for(int i = 0; i <= 10; i += 2){
			k += i;
		}
		System.out.println("짝수의 합은" + k);
		int o = 2;
		for(int i = 1; i < 10; i++) {
			System.out.println("구구단 2단 2x"+i + "=" + i*2);
		}
	}
}	
		