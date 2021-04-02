package p04.lecture;

public class A08Switch {
	public static void main(String[] args) {
		// switch case : 값이 일치하는 case문부터 실행
		// 사용 가능 type : byte, short, char, int, String, Enum
		int a = 1;
		
		switch (a) {
		case 1:
			System.out.println("케이스1");
			break;
		case 2:
			System.out.println("케이스2");
			break;
		case 3: // a값과 동일 출력
			System.out.println("케이스3");
			break; // 마지막은 break 가 없어도 됌
		}
	}
}
