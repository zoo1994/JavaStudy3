package com.sj.s2.constructor;

public class Car {
	String brand;
	String company;
	int cc;
	String color;
	
	//생성자
	public Car () {
		this.brand="k9";
		this.company="kia";
		this.cc=3000;
		this.color="white";
	}
	public Car (String brand) {
		
		this.brand=brand;
		this.company="kia";
		this.cc=3000;
		this.color = "white";
	}
	
	public Car (String brand,String color) {
		this.brand=brand;
		this.company="kia";
		this.cc=3000;
		this.color=color;
		
	}
	public Car (String brand, String color, int cc) {
		this.brand=brand;
		this.company="kia";
		this.cc=cc;
		this.color=color;
		
	}
	
	//멤버매서드
	public void info() {
		System.out.print("멤버메서드");
		System.out.print(this.brand);
		System.out.print(this.company);		
		System.out.print(this.cc);
		System.out.println(this.color);
	}
	
	
}
