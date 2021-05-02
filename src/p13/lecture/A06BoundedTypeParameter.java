package p13.lecture;

public class A06BoundedTypeParameter {
	public static void main(String[] args) {
		Generic6<String> g1 = new Generic6<>();
		Generic6<StringBuffer> g2 = new Generic6<>();
		Generic6<StringBuilder> g3 = new Generic6<>();
		
//		Generic6<Object> g4 = new Generic6<>();
	}
}

class Generic6<T extends CharSequence>{ // 상속받은 클래스에 타입만 사용가능
	// 어떤 타입이든지 간에 부모상속타입이라는것이 보장이됌.
}
