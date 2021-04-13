package p07.textbook.s070402;

public class SupersoncAirplaneExample {
	public static void main(String[] args) {
		SupersoncAirplane sa = new SupersoncAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersoncAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersoncAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
