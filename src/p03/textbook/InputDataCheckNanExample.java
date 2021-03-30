package p03.textbook;

public class InputDataCheckNanExample {
	public static void main(String[] args) {
		String userInput = "NaN";
				double val = Double.valueOf(userInput);
		
				double wallet = 10000.0;
				
				if(Double.isNaN(val)) {
					System.out.println("NaN이 입력되어 처리할 수 없음");
					val = 0.0;
				}
				
				wallet += val;
				System.out.println(wallet);
	
	}
}
