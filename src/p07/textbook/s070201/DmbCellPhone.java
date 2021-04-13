package p07.textbook.s070201;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 dmb 방송 수신을 합니다");
		
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다");
	}
	
	void turnOffDmb() {
		System.out.println("dmb 방송 수신을 멈춥니다");
	}
}
