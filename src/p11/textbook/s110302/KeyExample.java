package p11.textbook.s110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String > hashMap = new HashMap<Key, String>(); // hashmap(dictionary) 인스턴스는 다른 인스턴스를 저장하는 인스턴스 
																	// key, value 형태로 저장
																	// 자료 저장 형태
		
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		

	}
}
