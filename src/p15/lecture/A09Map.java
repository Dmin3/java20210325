package p15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A09Map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		// map에 넣는 매소드
		map.put(2, 99);
		map.put(3, 6);
		map.put(8, 77);
		
		System.out.println(map.size());
		// 같은 키를 갖고있기때문에 값이 77 => 88 로 덮어짐
		map.put(8, 88);
		
		System.out.println(map.get(2)); // 파라미터안에 들어가는 값은 키의값
		System.out.println(map.get(8));
		// Key의 특징 (중복 안되고 순서가 없음)
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		map.remove(8);
		System.out.println(map.size());
		
		
	}
}
