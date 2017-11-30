package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_map {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("��3", 23);
		map.put("��4", 24);
		map.put("��5", 25);
		
		/*Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "=" + value);
		}*/
		for (String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println(map);
	}

}
