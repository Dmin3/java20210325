package p06.textbook.exercise.ex15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 완료");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 패스워드가 올바르지 않음");
		}
	}
}
