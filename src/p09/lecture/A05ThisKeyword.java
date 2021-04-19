package p09.lecture;




public class A05ThisKeyword {
	public static void main(String[] args) {
		
	}
	
	
	
	
	int i = 0;
	
	void method() {
		System.out.println(this.i);
	}
	
	class InnerClass{
		int i = 3;
		
		void method1() {
			int i = 4;
			
			System.out.println(this.i); //필드 값에 i를 가리킴
			System.out.println(i); // 가장 가까운 i를 가리킴
			System.out.println(A05ThisKeyword.this.i);
		}
	}
}
