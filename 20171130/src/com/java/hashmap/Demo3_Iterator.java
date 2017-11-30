package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
	/*
	 * * A:键值对对象找键和值思路：
			* 获取所有键值对对象的集合
			* 遍历键值对对象的集合，获取到每一个键值对对象
			* 根据键值对对象找键和值
		d:获取功能
				* Set<Map.Entry<K,V>> entrySet():  获取键值对对象的单列集合
				* V get(Object key):根据键获取值
				* Set<K> keySet():获取集合中所有键的集合
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("张4", 24);
		map.put("张5", 25);
		map.put("张6", 26);
		map.put("张7", 27);
		
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> s= it.next();
			String key = s.getKey();
			Integer values = s.getValue();
			System.out.println(key + "=" + values);
		}
		
		for (Map.Entry<String, Integer> o : set) {
			System.out.print(o.getKey() + "=" + o.getValue());
		}
		
	}

}
