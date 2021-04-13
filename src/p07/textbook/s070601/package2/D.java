package p07.textbook.s070601.package2;

import p07.textbook.s070601.package1.A;

public class D extends A {
	public D() {
	super(); // A 생성자
	this.field = "value"; // A 안에 필드 값 지정
	this.method();
	}
}

// 다른 패키지여도 상속하여 쓰면 가능하다