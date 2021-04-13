package p07.textbook.s070704;

public class DirverExample {
	public static void main(String[] args) {
		Dirver dirver = new Dirver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		dirver.drive(taxi);
		dirver.drive(bus);
	}
}
