package p06.textbook.exercise.ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("=======================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("========================");
			System.out.print("선택 >");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
		
	


//계좌 생성하기
private static void createAccount() {
	
	System.out.println("---------");
	System.out.println("계좌생성");
	System.out.println("---------");
	
	
	System.out.print("계좌번호 : ");
	String ano = scanner.next();
	System.out.println("계좌주 :" );
	String owner = scanner.next();
	System.out.println("초기입금액 : ");
	int balance = scanner.nextInt();
	
	Account newAccount = new Account(ano, owner, balance);
	
	
	
	System.out.println("결과 : 계좌가 생성되었습니다");
	
	
	
}

private static void accountList() {
	System.out.println("---------");
	System.out.println("계좌목록");
	System.out.println("---------");
	
	
	
	}


private static void deposit() {
	
}

private static void withdraw() {
	
}
}



