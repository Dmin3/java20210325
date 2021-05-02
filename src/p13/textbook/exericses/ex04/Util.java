package p13.textbook.exericses.ex04;

public class Util {

	public static <K, V> Integer getValue(Pair<K, V> pair, K string) {
		K key = pair.getKey();
		
		if(key.equals(pair.getKey())) {
			return (Integer) pair.getValue(); 
		}
		return null;
	}

	
	

	
	
}
