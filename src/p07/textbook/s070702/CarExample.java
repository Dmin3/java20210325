package p07.textbook.s070702;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <= 5; i++) {
			int problemLocation = car.run();		
	
	
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 kumhotire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 hankooktire 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 kumhotire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
		System.out.println("------------------------------------");
		}
	}
}
