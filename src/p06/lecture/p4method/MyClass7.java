package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1!!!");
	}
	
	void method2(int i, int j) {
		System.out.println("method2@@@");
	}
	// 여러개 받겠다라는 뜻(배열로 출력된다는점)
	void method3(int... i){
		System.out.println("method3###");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	// 다른 파라미터랑 사용할때 도 무조건 뒤에 와야된다
	// 앞에서 사용 불가능함
	void method4(double d, int...i) {
		System.out.println("method4$$$$$");
	}
}
