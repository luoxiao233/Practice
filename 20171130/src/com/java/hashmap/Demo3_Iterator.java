package com.java.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {
	/*
	 * * A:��ֵ�Զ����Ҽ���ֵ˼·��
			* ��ȡ���м�ֵ�Զ���ļ���
			* ������ֵ�Զ���ļ��ϣ���ȡ��ÿһ����ֵ�Զ���
			* ���ݼ�ֵ�Զ����Ҽ���ֵ
		d:��ȡ����
				* Set<Map.Entry<K,V>> entrySet():  ��ȡ��ֵ�Զ���ĵ��м���
				* V get(Object key):���ݼ���ȡֵ
				* Set<K> keySet():��ȡ���������м��ļ���
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("����", 23);
		map.put("��4", 24);
		map.put("��5", 25);
		map.put("��6", 26);
		map.put("��7", 27);
		
		
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
