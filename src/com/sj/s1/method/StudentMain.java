package com.sj.s1.method;

public class StudentMain {

	public static void main(String[] args) {
//	 makeStudent 호출
//	 이름 번호 국어 영어 수학 출려
		StudentUtil ut = new StudentUtil();
		Student s = ut.makeStudent();

		Student[]ss = ut.makeStudents();
		
		for(int i=0;i<ss.length;i++) {
			Student student = ss[i];
			System.out.println("이름 : "+student.name);
			System.out.println("번호 : "+student.number);
			System.out.println("국어점수 : "+student.kor);
			System.out.println("영어점수 : "+student.eng);
			System.out.println("수학점수 : "+student.math);
			
			
		}
				
	}

}
