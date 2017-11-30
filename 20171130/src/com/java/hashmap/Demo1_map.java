package com.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Demo1_map {
	/*
	 * * A:Map���ϵĹ��ܸ���
			* a:��ӹ���
				* V put(K key,V value):���Ԫ�ء�
					* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
					* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
			* b:ɾ������
				* void clear():�Ƴ����еļ�ֵ��Ԫ��
				* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
			* c:�жϹ���
				* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
				* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
				* boolean isEmpty()���жϼ����Ƿ�Ϊ��
			* d:��ȡ����
				* Set<Map.Entry<K,V>> entrySet():
				* V get(Object key):���ݼ���ȡֵ
				* Set<K> keySet():��ȡ���������м��ļ���
				* Collection<V> values():��ȡ����������ֵ�ļ���
			* e:���ȹ���
				* int size()�����ؼ����еļ�ֵ�Եĸ���
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("С��", 23);
		map.put("С1", 21);
		map.put("С2", 22);
		map.put("С3", 23);
		map.put("С4", 24);
		
		System.out.println(map);
		map.remove("С2");
		System.out.println(map);
		System.out.println(map.size());
		
	}

}
