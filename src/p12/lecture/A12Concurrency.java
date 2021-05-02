package p12.lecture;

public class A12Concurrency {
	static long shareValue = 0;
	
	// 동시에 작업하기때문에 생기는 문제들
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 1_00_000; i++) {
					shareValue++;
				}
				
			}
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(shareValue);
	}
}

class Thread12 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
