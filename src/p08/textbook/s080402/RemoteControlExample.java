package p08.textbook.s080402;

import p08.lecture.s080301.Television;
import p08.textbook.s080205.RemoteContol;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteContol rc = null; // 참조하는 인스턴스가 없다고 표시를 해주는거다.
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
