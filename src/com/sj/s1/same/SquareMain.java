package com.sj.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		s1.garo = 4;
		s1.sero = 4;
		
		Square s2 = new Square();
		s2.garo=4;
		s2.sero=5;
		
		System.out.println(s1.same(s2, s1));

	}

}
