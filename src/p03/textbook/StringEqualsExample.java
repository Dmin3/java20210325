package p03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		boolean a = strVar1.equals(strVar2);
		boolean b = strVar1.equals(strVar3);
		
		System.out.println(a);
		System.out.println(b);
	}
}
