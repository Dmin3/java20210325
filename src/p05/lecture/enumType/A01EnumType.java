package p05.lecture.enumType;

public class A01EnumType {
	public static void main(String[] args) {
		MyClass o1 = new MyClass(); // 무한히 많은 인스턴스를 만듬
		
		MyEnum e1 = MyEnum.MY_VALUE;
		MyEnum e2 = MyEnum.VALUE1;
		MyEnum e3 = MyEnum.VALUE2;
		// 정해진 인스턴스만 만들수 있음
		MyEnum e4 = MyEnum.MY_VALUE;
		System.out.println(e1 == e4); // true
		System.out.println(e1.equals(e2)); // object 메소드를 다 가지고있음
		System.out.println(e3.toString());
		System.out.println(e4.hashCode());
	}
}

class MyClass {
	
}
