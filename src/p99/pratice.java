package p99;

public class pratice {
	public static void main(String[] args) {
		String delimiter = "-------";
		printA(delimiter);
		printB(delimiter);
		delimiter = "*****";
		printA(delimiter);
		printB(delimiter);
		
	}

	private static void printA(String delimiter ) {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	private static void printB(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}
