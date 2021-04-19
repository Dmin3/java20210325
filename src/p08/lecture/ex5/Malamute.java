package p08.lecture.ex5;




public class Malamute extends KindaDog implements Pet, SledDog {
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("왈왈~~");
		
		
	}

	

	@Override
	public void sit() {
		// TODO Auto-generated method stub
		System.out.println("앉습니다");
	}



	@Override
	public void pull() {
		// TODO Auto-generated method stub
		System.out.println("밀어냅니다");
	}
}
