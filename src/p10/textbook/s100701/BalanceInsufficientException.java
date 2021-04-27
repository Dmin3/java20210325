package p10.textbook.s100701;

public class BalanceInsufficientException extends Exception { // 잔고가 충분하지 않을때 나오게하는 오류코드
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
