package p06.lecture.p3constructor;

public class A01construtor {
	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.name = "tesla";
//		car1.model = "model3";
//		
//		Car car2 = new Car();
//		car2.name = "bmw";
//		car2.model = "model7";
		
		Car car1 = new Car("tesla", "model3");
		System.out.println(car1.name);
		System.out.println(car1.model);
		
		Car car2 = new Car("bmw" , "model7");
		System.out.println(car2.name);
		System.out.println(car2.model);
	}
}
