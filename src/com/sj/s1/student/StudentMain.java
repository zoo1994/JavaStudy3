package com.sj.s1.student;

public class StudentMain {
//	main문
//1프로그램 start와 초기화 
//2test

	public static void main(String[] args) {
		StudentController sc = new StudentController();
		Student st = new Student();
		st.name = "a";
		st.kor = 15;
		st.math = 21;
		st.eng = 34;
		st.makeTotal();
		sc.start();
	
		System.out.println("finish");
		
		
	

	}

}
