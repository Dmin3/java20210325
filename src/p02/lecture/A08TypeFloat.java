package p02.lecture;

public class A08TypeFloat {
	public static void main(String[] args) {
		// float: 4byte (32bit) 실수 저장
		
		float var;
		var = 3.14F; // 소수점을 가진 값을 넣을수 있음.
					// 실수 literal은 double 뒤에 F를 붙어줘야지 F라는거 이해
		
		
		//양수 최대값
		 System.out.println(Float.MAX_VALUE);
		//양수 최소값
		System.out.println(Float.MIN_VALUE);
		//음수 최소값
		System.out.println(-Float.MAX_VALUE);
		//음수 최댓값
		System.out.println(-Float.MIN_VALUE);
		
		//양의 무한대
		System.out.println(Float.POSITIVE_INFINITY);
		//음의 무한대
		System.out.println(Float.NEGATIVE_INFINITY);
		
		//NaN (Not a Number)
		System.out.println(Float.NaN);
		
	}
}
