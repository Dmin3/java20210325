package p05.lecture;

public class A24ArrayofArray {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		int[][] arr2 = new int[2][3];
		/* 첫번째 네모는 arr2에 원소가 몇개일지 정해줌
		 	두번째 네모는 
		 */
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		for (int i = 0; i < arr2.length; i++) {
				for(int j = 0; j < arr2[i].length; j++) {
					System.out.println(arr2[i][j]);
				}
		}
		
		System.out.println("------값 변경------");
		arr2[1][1] = 9;
		arr2[0][2] = 8;
		
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
	}
		System.out.println("---- Arrays.toString() ----");
		
		
		
		
	}
}
