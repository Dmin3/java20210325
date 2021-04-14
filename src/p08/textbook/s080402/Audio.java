package p08.textbook.s080402;

import p08.textbook.s080205.RemoteContol;

public class Audio implements RemoteContol { //필드,디폴트메소드,스태틱메소드,추상메소드를 다 갖고있음
	//필드
	private int volume;
	private boolean mute;
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
		if(volume > MAX_VOLUME) {
			this.volume = RemoteContol.MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = RemoteContol.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio :" + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) { // 디폴트 메소드 재정의
		// TODO Auto-generated method stub
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음처리합니다");	
		} else {
			System.out.println("Audio 무음 해제합니다");
		}
	}
}
