package MyPratice;

public class Employee {
	String name;
	int[] hours;
	
	public Employee(String str, int[] arr) {
		name = str;
		hours = arr;
	}
	
	void printTotalHours(){
		System.out.println(name + " -->" + totalHours() + "시간" );
	}
	
	int totalHours() {
		int sum = 0;
		for(int i = 0; i < hours.length; i++) {
			sum += hours[i];
		}
		return sum;
	}
}
