package com.java.list;

import java.util.LinkedList;

public class Stack {
	private LinkedList list = new LinkedList();
	
	public void in(Object obj){
		list.addFirst(obj);
	}
	public Object out(){
		return list.removeLast();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
