package MyPratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dd {
	
		public static void main(String[] args) {
			Map<String, Integer> map = new HashMap<>();
			map.put("blue", 96);
			map.put("hong", 86);
			map.put("white", 92);

			String name = null;
			int maxScore = 0;
			int totalScore = 0;
		
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			for(Map.Entry<String, Integer> entry : entrySet) {
				
					System.out.println(entry);
					
				}
			
				
			}
		
			

		}
	

