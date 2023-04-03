package map_demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<>();
		map.put("Harry", 85);
		map.put("Lexy", 24);
		map.put("Josh", 32);
		
		Set<String> keySet = map.keySet();
		System.out.println("keySet: " + keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("values: " + values);
		
		for (String key: keySet){
			System.out.println("Key: " + key + ", value: " + map.get(key));
		}
	}
}
