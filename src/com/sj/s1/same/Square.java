package com.sj.s1.same;

public class Square {
	int garo;
	int sero;
	
	public boolean same(Square s,Square s1) {
		//맴버변수 garo랑 매개변수로 받은 객체의 garo 같고
		//멤버변수 sero랑 매개변수로 받은 객체의 sero 갖으면 true
		boolean a = s.garo ==s1.garo & s.sero==s1.sero;
		return a;

		
	}
	
	
}
