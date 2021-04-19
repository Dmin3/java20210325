package p08.textbook.s080302;

import p08.textbook.s080205.RemoteContol;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		 RemoteContol rc = new RemoteContol() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(RemoteContol.MAX_VOLUME);
		System.out.println(RemoteContol.MIN_VOLUME);
		rc.setMute(false);
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		
		RemoteContol.changeBattery();
		
	}
}
