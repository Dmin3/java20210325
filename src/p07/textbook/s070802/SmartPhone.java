package p07.textbook.s070802;

public class SmartPhone extends Phone {
	// 생성자
	public SmartPhone (String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다");
	}
}