package p13.lecture;

public class A08WildCard {
	public static void main(String[] args) {
		putBox(new Box8<MyClass8>());
		putBox(new Box8<Object>());
		
		getBox(new Box8<MyClass8>());
		getBox(new Box8<Child8>());
	}
	
	public static void putBox(Box8<? super MyClass8> box) {
		// MyClass 보단 상위클래스는 사용가능
		box.setField(new MyClass8());
	}
	
	public static void getBox(Box8<? extends MyClass8> box) {
		// MyClass타입은 가능 부모타입이니깐
		MyClass8 o1 = box.getField();
	}
	
	public static void allBox(Box8<?> box) {
		// ? 하나는 모든 타입이 들어갈수있다.
		Object o1 = box.getField();
//		box.setField(new Object()); // ?는 모든 타입을 넣을수있지만
		// Object는 아니다
	}
}

class Box8<T> {
	private T field;
	
	public void setField(T field) {
		this.field = field;
	}
	public T getField() {
		return field;
	}
}

class MyClass8 {}
class Child8 extends MyClass8 {}