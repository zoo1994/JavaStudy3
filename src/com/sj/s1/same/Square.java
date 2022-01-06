package com.sj.s1.same;

public class Square {
	int garo;
	int sero;
	//맴버변수 garo랑 매개변수로 받은 객체의 garo 같고
	//멤버변수 sero랑 매개변수로 받은 객체의 sero 같으면 true
	
	public boolean same(Square s) {
		if(this.garo==s.garo&&this.sero==s.sero) {
			return true;
		}else {
		return false;}

		
	}
	
	
}
