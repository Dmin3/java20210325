package p08.lecture.s080301;

import p08.textbook.s080205.RemoteContol;

public class Audio implements RemoteContol {	// 추상 메소드를 모두 구현해야할 책임을 갖짐 아니면 실행불가
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다");
	}
	
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteContol.MAX_VOLUME) {
			this.volume = RemoteContol.MAX_VOLUME;
		} else if(volume < RemoteContol.MIN_VOLUME) {
			this.volume = RemoteContol.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio볼륨 :" + this.volume);
	}
}
