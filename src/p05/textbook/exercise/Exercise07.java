package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {5, 1, 3, 8, 2};
		//최댓값
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}		
		}
		int min = Integer.MAX_VALUE;
		//최소값
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
		}
		}
		//합계
		int sum = 0;
		
		//평균
		int avg = 0;
		System.out.println("max :" + max);
		System.out.println("min :" + min);
		System.out.println("avg :" + avg);
		System.out.println("sum :" + sum);
	}
}
