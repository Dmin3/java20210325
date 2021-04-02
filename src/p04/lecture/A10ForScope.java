package p04.lecture;

public class A10ForScope {
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a);
		// 밖에서 쓰고싶다면 선언을 밖에서 
		for(int i = 0; i < 5; i++) { // i는 코드블록 안에서만 사용가능
			System.out.println(i);
		}
		
		
	}
}
