package com.sj.s1.student;

public class Student {
	//data저장용도
	String name;
	int number;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void makeTotal() {
		this.total = this.kor + this.eng + this.math ;
		this.avg = this.total/3.0;
	
	}
	
	public void hello() {
		System.out.println("hi");
		
	}

}
