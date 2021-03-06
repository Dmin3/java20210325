package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,6,7,10);
		List<Integer> list2 = Arrays.asList(-3,-8,-10,-99,-22);
		List<Integer> list3 = Arrays.asList(8888,9999,222,111);
		List<Integer> list4 = Arrays.asList(3030,223,123);
		
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<>();  // 위에있는거와 똑같음
		
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		
		int max = max(list); 	
		System.out.println(max);
		
		// 향상된 for문
		max = max2(list);
		System.out.println(max);
		
		List<Integer> flatList = flat(list);
		System.out.println(flatList.size()); // 16
		System.out.println(flatList.get(15)); // 123
		
		List<Integer> flatList1 = flat2(list);
		System.out.println(flatList1.size());
		System.out.println(flatList1.get(15));
		
	}

	private static List<Integer> flat2(List<List<Integer>> list) {
		List<Integer> flat = new ArrayList<Integer>();
		for(List<Integer> sub : list) {
			for(int item : sub) {
				flat.add(item);
			}
		}
		return flat ;
	}

	private static List<Integer> flat(List<List<Integer>> list) {
		List<Integer> allList = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			List<Integer> subList = list.get(i);
			for(int j = 0; j < subList.size(); j++) {
				allList.add(subList.get(j));
			}
		}
		return allList;
		
		
		
	}

	private static int max2(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;
		for(List<Integer> sub : list) {
			for(int item : sub) {
				if (item > max) {
					max = item;
				}
			}
		}
		return max;
	}

	private static int max(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;
		
		
			for(int i = 0; i < list.size(); i++) {
				List<Integer> subList = list.get(i);
				
				for(int j = 0; j < subList.size(); j++) {
					int item = subList.get(j);
					if(item > max) {
						max = item;
					}
				}
			}
		
		
		return max;
	}
}
