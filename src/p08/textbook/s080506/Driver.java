package p08.textbook.s080506;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // 조건에서  true 이므로 실행
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
