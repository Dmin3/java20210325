package p12.lecture;

public class A02Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread2();
		t1.start(); // run 메소드 대신 start 메소드 사용
		
		int end = 1_0000_0000; // Thread 메소드와 동시에 실행이됌!
		for(int i = 0; i < end; i++) {
			System.out.println("main thread 실행");
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int end = 1_0000_0000;
		for(int i = 0; i < end; i++) {
			System.out.println("Thread2 실행");
		}
	}
}
