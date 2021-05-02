package p12.lecture;

public class A03ThreadSleep {
	public static void main(String[] args) {
		
		System.out.println("실행1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Thread 가 실행을 1초 멈춤
		
		System.out.println("실행2");
		
	}
}
