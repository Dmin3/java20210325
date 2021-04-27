package p10.lecture;

public class IZeroException extends Exception {
	public IZeroException() {
		
	} // 기본생성자 생성
	
	
	public IZeroException(String message) {
		super(message);
	}
}
