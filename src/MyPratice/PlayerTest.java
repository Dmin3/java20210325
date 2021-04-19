package MyPratice;

public class PlayerTest {
	public static void main(String[] args) {
		int[] point1 = { 10, 9, 9, 8 };
		int[] point2 = { 9, 10, 9, 9};
		int[] point3 = {10, 9, 10, 10};
		
		Player p1 = new Player("Kim", point1);
		Player p2 = new Player("Lee", point2);
		Player p3 = new Player("Park", point3);
		Player[] play = {p1, p2, p3};
		for(int i = 0; i < play.length; i++) {
			play[i].printTotalPoints();
		}
		
}
}