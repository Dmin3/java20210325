package p08.textbook.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//vehicle.checkFare();   vehicle 인터페이스에 없음
		
		Bus bus = (Bus) vehicle; // 강제형변환
		
		bus.run();
		bus.checkFare();
	}
}
