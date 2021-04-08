package p06.lecture.p4method;

import java.util.Arrays;

public class A05Parameter {
	public static void main(String[] args) {
		MyClass5 c1 = new MyClass5();
		
		
		
		// argument(아규먼트),인수,인자
		c1.method1();
		c1.method2(26); // 파라미터에 int 를 받는다고 정의했기때문에
		//안 넣으면 실행 자체가 안됌
		int x = 5;
		int y = 7;
		c1.method3(x, y);
		c1.method3(10, 20);
		int[] arr1 = {1, 2, 3};
		c1.method4(arr1);
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		
		
		c1.method4(new int[] {9, 8});
		
	}
}
