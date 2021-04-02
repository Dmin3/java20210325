package p04.textbook;

public class ForMultiplicationTableExample2 {
	public static void main(String[] args) {
		/*
		*
		**
		***
		****
		*****
		 */
//		System.out.println("새로운 줄");
//		System.out.println("새로운 줄");
//		System.out.println("같은 줄");
//		System.out.println("같은 줄");
//		System.out.println("새로운 줄");
		/*
		 *****
		 ****
		 ***
		 **
		 * 
		 */
		for (int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("1번");
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("3번");
		for (int i = 5; i > 0; i--) {
			for(int k = 5; k > i; k--) {
			System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		
		 
		 
		
		
		
		}
		System.out.println("<---------------->");
		
		}
	}
