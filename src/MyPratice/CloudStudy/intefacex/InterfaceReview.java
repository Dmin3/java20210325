package MyPratice.CloudStudy.intefacex;

import java.util.ArrayList;
import java.util.List;

public class InterfaceReview {
	public static void main(String[] args) {
		Sounding dog = new Dog();
		Sounding baby = new Baby();
		Sounding tiger = new Tiger();
		Sounding robot = new Robot();
		
		List<Sounding> list = new ArrayList<>();
		
		list.add(dog);
		list.add(baby);
		list.add(tiger);
		list.add(robot);
		
		for(Sounding item : list) {
			item.sound();
		}
		
				
		
		
		
	}
}

class Dog implements Sounding{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog : 멍멍!");
	}
}
class Baby implements Sounding{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Baby : 응애!");
	}
}
class Tiger implements Sounding {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Tiger : 어흥!");
	}
}
class Robot implements Sounding {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Robot : 삐빕!");
	}
	
}

