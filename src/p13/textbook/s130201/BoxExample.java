package p13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("홍길동");
		String name = (String) box.getObject(); // 강제 타입변환
		
		box.setObject(new Apple());
		
		Apple apple = (Apple) box.getObject(); // 강테 타입변환
	}
}
