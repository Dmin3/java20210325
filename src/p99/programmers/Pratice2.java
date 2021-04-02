package p99.programmers;

public class Pratice2 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		
		System.out.println(arr[1]);
		// 값이 60인 인덱스 출력
		 int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		 int i = 0;
		 for(i = 0; i <arr1.length; i++) {
			 if(arr1[i] == 60) {
				 System.out.println(i);
			 }
		 }
	}
}
