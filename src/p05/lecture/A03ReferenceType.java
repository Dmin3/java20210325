package p05.lecture;

public class A03ReferenceType {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		
		String t = new String("java");
		String s = new String("java");
		
		System.out.println(i == j);
		System.out.println(s == t);
		
		
	}
}
