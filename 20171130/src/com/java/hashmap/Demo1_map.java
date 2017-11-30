package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Demo1_map {
	/*
	 * * A:Map集合的功能概述
			* a:添加功能
				* V put(K key,V value):添加元素。
					* 如果键是第一次存储，就直接存储元素，返回null
					* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
			* b:删除功能
				* void clear():移除所有的键值对元素
				* V remove(Object key)：根据键删除键值对元素，并把值返回
			* c:判断功能
				* boolean containsKey(Object key)：判断集合是否包含指定的键
				* boolean containsValue(Object value):判断集合是否包含指定的值
				* boolean isEmpty()：判断集合是否为空
			* d:获取功能
				* Set<Map.Entry<K,V>> entrySet():
				* V get(Object key):根据键获取值
				* Set<K> keySet():获取集合中所有键的集合
				* Collection<V> values():获取集合中所有值的集合
			* e:长度功能
				* int size()：返回集合中的键值对的个数
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("小王", 23);
		map.put("小1", 21);
		map.put("小2", 22);
		map.put("小3", 23);
		map.put("小4", 24);
		
		System.out.println(map);
		map.remove("小2");
		System.out.println(map);
		System.out.println(map.size());
		
	}

}
