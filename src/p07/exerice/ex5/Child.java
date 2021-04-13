package p07.exerice.ex5;

public class Child extends Parent {
	private int studentNo;
	
	
	public Child(String name, int studentNo) {
		super(name); // 상위 생성자 무조건 호출
		this.studentNo = studentNo;
		this.name = name;
	}
}
