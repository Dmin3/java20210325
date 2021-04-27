package p11.lecture.object;

public class A05HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode()); // 해시코드가 다름
		System.out.println(o2.hashCode()); // 해시코드가 다름
		
		String s1 = new String("java");
		String s2 = enw String("java");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
}
