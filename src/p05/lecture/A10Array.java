package p05.lecture;

public class A10Array {
	// 그림 : 06.배열.png
	public static void main(String[] args) {
		//array(배열) : 여러개의 값을 갖는 자료형
		
		int i =0 ;
		i = 5; // 값을 하나만 넣을수 있음
		
		int[] arr; // 여러개의 변수를 넣겠다는 의미 , 배열도 참조타입
		arr = new int[3]; // 변수 3개를 갖겠다고 명시해줌
		int c = arr[0] = 5;
		int b =	arr[1] = 7;
		int a =	arr[2] = 6;
			
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		
	}
}
