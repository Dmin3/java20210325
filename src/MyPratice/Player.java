package MyPratice;

public class Player {
	String name;
	int[] points;
	
	public Player(String str, int[] scores) {
		name = str;
		points = scores;
	}
	
	public void printTotalPoints() {
		System.out.println(name + " -->" + totalPoints() + "점");
	}
	
	public int totalPoints() {
		int sum = 0;
		for(int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		return sum;
	}
}
