package p04.textbook;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
		} while ( !inputString.equals("q"));
		// do는 무조건 한번은 실행 하고 while 에 있는 조건이 true이면
		// do로 다시 돌아간다.
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
