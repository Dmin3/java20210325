package MyPratice.CloudStudy.붕어빵;

public class FishBread {
	String contents; // 내용물
	static int count; // 붕어빵 객체 수
	
	// 생성자
	public FishBread(int n) {
		String[] arr = {"팥", "고구마", "치즈", "슈크림"};
		contents = arr[n];
		
		FishBread.count++;
	}
	
	// 메소드
	void print() {
		System.out.println(contents + "붕어빵");
	}
}
