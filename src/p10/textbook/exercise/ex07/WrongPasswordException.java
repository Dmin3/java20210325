package p10.textbook.exercise.ex07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {} // 기본 생성자 호출
	public WrongPasswordException(String message) { // 생성자 생성
		super(message);
	}
}
