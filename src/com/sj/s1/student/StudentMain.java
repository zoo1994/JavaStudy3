package com.sj.s1.student;

public class StudentMain {
//	main문
//1프로그램 start와 초기화 
//2test
	public static void main(String[] args) {
		StudentView sv = new StudentView();
		Student st = new Student();
		Student[]sts = new Student[2];
		sts[0].name = "a";
		sts[0].number = 1;
		sts[0].kor = 81;
		sts[0].eng = 68;
		sts[0].math = 88;
		sts[1].name = "b";
		sts[1].number = 2;
		sts[1].kor = 24;
		sts[1].eng = 58;
		sts[1].math = 81;
		st.name = "a";
		st.number = 1;
		st.kor = 92;
		st.eng = 56;
		st.math = 78;
		sv.viewMessage(st);
		sv.viewStudent(st);
		sv.viewStudents(sts);
		
	

	}

}
