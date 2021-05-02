package p12.lecture;

public class A08RunnableLamda {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread1 실행");
			}
		});
		t1.start();
		
		//Lambda 표현식
		Thread t2 = new Thread(() -> System.out.println("thread2 실행"));
		t2.start();
	}
}
