package p11.textbook.s110602;

import p07.textbook.s070802.*;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("p07.textbook.s070802.Phone");
		
		System.out.println("[클래스 이름");
		System.out.println(clazz.getName());
		System.out.println();
		
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for(constructors)
	}
}
