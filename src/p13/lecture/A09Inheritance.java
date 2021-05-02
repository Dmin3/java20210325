package p13.lecture;

public class A09Inheritance {

}

class Generic9<T>{
	
}

class ChildGeneric9<T> extends Generic9<T>{
	
}

class ChildGeneric92<T, U> extends Generic9<T>{
	// 타입을 추가로 작성 할수있음
}

class ChildGeneric93 extends Generic9<String>{} 
// 부모타입이 정해지면 자식 클래스 타입을 정해줄 필요없다
