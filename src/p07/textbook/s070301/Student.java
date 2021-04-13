package p07.textbook.s070301;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 생성자 호출은 항상 맨위에! 작성할것!
		this.studentNo = studentNo;
	}
}
