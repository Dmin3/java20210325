package p03.textbook;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		
		int number = 7;
		
		int temp = totalPieces - number;
		
		double result = temp / 10.0;  // 정확한 계산을 사용할때는 부동소수점 타입을
									//사용하지 않는다
		//실수 연산은 주의해서 해야된다
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result + "조각이 남는다.");
	}
}
