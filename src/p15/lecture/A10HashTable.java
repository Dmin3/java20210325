package p15.lecture;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class A10HashTable {
	public static void main(String[] args) {
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new Hashtable<>();
		
		map2.put(3, 99);
		map2.put(4, 16);
		map2.put(5, 25);
		
		System.out.println(map2.size());
		
		map2.put(3, 9);
		// map의 key값은 하나밖게 존재하지 못하기때문에 크기는 똑같음
		System.out.println(map2.size());
		
		Set<Map.Entry<Integer, Integer>> entrySet = map2.entrySet();
		
		for(Map.Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
