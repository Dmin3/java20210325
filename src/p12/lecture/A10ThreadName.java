package p12.lecture;

public class A10ThreadName {
	public static void main(String[] args) {
		// setname 사용하기
		Thread t1 = new Thread(new Thread10());
		t1.setName("thread 999");
		t1.start();
		
		// 생성자 사용하기
		Thread t2 = new Thread(new Thread10(), "ad thread");
		t2.start();
	}
}

class Thread10 implements Runnable{
	@Override
	public void run() {
	Thread currentThread = Thread.currentThread();
	System.out.println(currentThread.getName());
	
		
	}
}
