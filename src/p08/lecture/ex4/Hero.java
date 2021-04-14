package p08.lecture.ex4;

import java.util.Set;

public class Hero {
	private Gun gun;
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public Gun getGun() {
		return gun;
	}
	
	public void attack() {
		this.gun.fire();
	}
}
