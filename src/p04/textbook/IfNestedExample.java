package p04.textbook;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81; // 81이상 100이하
		System.out.println("점수" + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
			System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} 
		
	}
}
