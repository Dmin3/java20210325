package p02.lecture;

public class A01Variable {
	public static void main(String[] args) {
		//변수 : 값을 저장하는 공간의 이름
		//변수 선언 방법 :
		//type명 변수명; int가 type임
		int a;

		//변수명 작성 규칙:
		//$, _, 영문대소문자, 숫자 조합
		//숫자가 앞에 오면 안됨.
		//작성 관습:lowerCamelCase
		
		//type : 기본타입, 참조타입(할게 많아서 챕터5로 따로 빠져있음)
		//type :기본타입(8개), 참조타입(5개)
		// 기본타입 8개 :byte, short, int, long, boolean, char, float, double
		
		//값 할당 =,+=,*=,/=,%= : 할당 연산자사용
		
		a = 5;
		
		System.out.println(a); // 5라는 값이 출력
		
		a = 7;
		
		System.out.println(a); // 위에서부터 순서대로 실행되므로 5와7이 순서대로 출력
	}
}
