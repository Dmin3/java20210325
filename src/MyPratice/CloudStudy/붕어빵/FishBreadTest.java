package MyPratice.CloudStudy.붕어빵;

public class FishBreadTest {
	public static void main(String[] args) {
		//객체 배열 생성
		FishBread[] breads = new FishBread[4];
		
		/* 1. 붕어빵 객체를 팥/고구마/치즈/슈크림 순으로 만드시오. */
		breads[0] = new FishBread(0);
		breads[1] = new FishBread(1);
		breads[2] = new FishBread(2);
		breads[3] = new FishBread(3);
		
		// 모든 붕어빵 객체 정보 출력
		for(int i = 0; i < FishBread.count; i++) {
			breads[i].print();
		}
		System.out.println("붕어빵 객체 수 :" + FishBread.count);
	}
}
