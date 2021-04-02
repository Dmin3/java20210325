package p99;

public class pratice {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		
		while(i < limit) {
		output += i;
		i++;
		}
		return output;
		
		
		
	}
	
	
	public static void main(String[] args) {
		String result = numbering(0, 5);
		
		System.out.println(result);
		
	}
}
