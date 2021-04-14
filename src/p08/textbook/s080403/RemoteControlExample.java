package p08.textbook.s080403;

import p08.textbook.s080205.RemoteContol;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteContol.changeBattery(); // 인스턴스를만들지않아도 사용가능 (정적(static)메소드 이기때문이다.)
		System.out.println(RemoteContol.MAX_VOLUME); // 필드도 정적이기때문에 인스턴스 없이 사용가능하다.
		
		
	}
}
