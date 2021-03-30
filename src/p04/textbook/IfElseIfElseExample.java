package p04.textbook;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은 a입니다");
			
		} else if (score >=80) {
			System.out.println("점수가 80~90 입니다");
			System.out.println("등급은 b입니다");
		} else if (score >= 70) {
			System.out.println("점수가 70~80 입니다");
			System.out.println("등급은 c입니다");
		} else {
			System.out.println("점수가 70 미만입니다");
			System.out.println("등급은 d입니다");
		}
	}
}
