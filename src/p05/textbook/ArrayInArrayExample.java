package p05.textbook;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i = 0; i < mathScores.length; i++) {
			for(int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"] ="+ mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		for(int i =0; i < englishScore.length; i++) {
			for(int k = 0; k < englishScore[i].length; k++) {
				System.out.println("englishScore["+i+"]["+k+"] =" + englishScore[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScore = { {95, 80}, {92, 96, 80} };
		for(int i =0; i < javaScore.length; i++) {
			for(int k = 0; k < javaScore[i].length; k++) {
				System.out.println("javaScore["+i+"]["+k+"] = " + javaScore[i][k]);
			}
		}
	}
}
