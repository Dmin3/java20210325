package p10.lecture;

public class A12MultiCatchBlock {
	public static void main(String[] args) {
		try {
			String[] arr1 = {"abc"};
			Integer.parseInt(arr1[1]);
		} catch (ArrayIndexOutOfBoundsException  | NumberFormatException e) {
			System.out.println("프로그램 오류"); // | 를 사용하여 코드를 간결하게 할수있다
		} 
	}
}
