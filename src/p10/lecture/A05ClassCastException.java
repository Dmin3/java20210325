package p10.lecture;

public class A05ClassCastException {
	public static void main(String[] args) {
		String str1 = "java";
		Object o1 = str1;
		String str2 = (String) o1;
		StringBuffer sb1 = (StringBuffer) o1;
	}
}
