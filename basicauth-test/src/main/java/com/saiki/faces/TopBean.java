package com.saiki.faces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TopBean {
	public String name;

	public TopBean() {
		super();
		System.out.println("abc");
		name = "saiki";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String exec() {
		System.out.println("exec called");
		return "abc";
	}
}
