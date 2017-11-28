package com.java.bean;

public class Tool <Q>{
	private Q q;

	public Tool() {
		super();
	}

	public Tool(Q q) {
		super();
		this.q = q;
	}

	public Q getQ() {
		return q;
	}

	public void setQ(Q q) {
		this.q = q;
	}
	
}
