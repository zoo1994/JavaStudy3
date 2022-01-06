package com.sj.s2.constructor;

public class Engine {
	String name="v1";
	String fue1="f1";
	
	{
		//초기화 블럭
		name = "v2";
		this.fue1="f2";
		
	}
	
	public Engine() {
		this.name="v3";
		this.fue1="f3";
		
	}
	

	public void info() {
		System.out.println(this.name);
		System.out.println(this.fue1);
	}
	
	
}
