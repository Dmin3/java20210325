package p12.lecture;

public class A14SynchoronizedMethod {
	public static void main(String[] args) {
		Thread14 t1 = new Thread14();
		Thread14 t2 = new Thread14();
		
		Box box = new Box();
		t1.box = box;
		t2.box = box;
		
		t1.start();
		t2.start();
		
	}
}

class Thread14 extends Thread {
	public Box box;
	
	@Override
	public void run() {
		box.execute();
	}
}

class Box {
	public synchronized void execute() { // 실행과 종료가 보장이 되야되는 메소드
		// 동시에 실행되지 않도록 보장해주는거
		System.out.println("method start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method end");
	}
}
