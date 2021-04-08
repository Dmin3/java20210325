package p06.lecture.p4method;

public class MyClass1 {
	// fields
	int age;
	String name;
	
	MyClass1(){
	//constructors
	}
	MyClass1(String name){
		this.name = name;
	}
	//methods
	/* 리턴타입 메소드명 (파라미터 리스트){
	 실행될 명령문들...
     }*/  
	/* 
	 * 
	 * */
	void method1(String param1, int param2){
		//statements...
		System.out.println("method 호출~~");
	}
	int method2() {
		System.out.println("method2 호출!!");
		return 3;
	}
}
