package p05.lecture;

public class A07ReferenceValue {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		int a = System.identityHashCode(s); // 참조변수에 값을 알고 싶을때.
		System.out.println(a);
		
		int tHashcode = System.identityHashCode(t);
		System.out.println(tHashcode); 
		
		int uHashcode = System.identityHashCode(u);
		System.out.println(uHashcode);
		
	}
}
