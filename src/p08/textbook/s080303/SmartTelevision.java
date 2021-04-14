package p08.textbook.s080303;

import p08.textbook.s080205.RemoteContol;

public class SmartTelevision implements RemoteContol, Searchable {

	private int volume;


	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");
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
		System.out.println("현재 TV볼륨 : " + this.volume);
		}
	
		
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다");
	}
	}

