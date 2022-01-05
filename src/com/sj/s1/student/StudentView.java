package com.sj.s1.student;

import java.util.Scanner;

public class StudentView {
	//출력전용

		Scanner sv = new Scanner(System.in);
		public void viewMessage(Student st) {
			//문자열 출력
			System.out.println("-----------------------------------");
			System.out.println(st.msg);
			System.out.println("-----------------------------------");			
		}
		
		public void viewStudent(Student st) {
			//학생의 모든 정보를 출력
			System.out.println("이름"+"\t"+"번호"+"\t"+"국어점수"+"\t"+"영어점수"+"\t"+"수학점수");
			System.out.print(st.name+"\t");
			System.out.print(st.number+"번"+"\t");
			System.out.print(st.kor+"점"+"\t");
			System.out.print(st.eng+"점"+"\t");
			System.out.println(st.math+"점");
			
		}
		
		public void viewStudents(Student [] sts) {
			//여려명 학생의 모든 정보를 출력
			System.out.println("이름"+"\t"+"번호"+"\t"+"국어점수"+"\t"+"영어점수"+"\t"+"수학점수");
			for(int i=0;i<sts.length;i++) {
			System.out.print(sts[i].name+"\t");
			System.out.print(sts[i].number+"번"+"\t");
			System.out.print(sts[i].kor+"점"+"\t");
			System.out.print(sts[i].eng+"점"+"\t");
			System.out.println(sts[i].math+"점");
			}
			
		}
}
