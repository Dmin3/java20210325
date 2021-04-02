package p04.textbook;

public class SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		//String 은 == 표현이 아닌 .equals로 비교해야댐
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}
	}
}
