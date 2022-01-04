package com.sj.s1.method;

import java.util.Scanner;

public class StudentUtil {
	//키보드로부터 이릅, 번호, 국어, 영어, 수학 입력 리턴
	
	public Student makeStudent() {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		s.name= sc.next();
		System.out.println("번호를 입력하세요");
		s.number = sc.nextInt();
		System.out.println("국어 점수를 입력하세요");
		s.kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		s.eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		s.math = sc.nextInt();
		
		return s;
				
	}
	public Student [] makeStudents() {
		//학생의 수를 입력받음
		//키보드로부터 이름 번호 국어 영어 수학 입력
		//학생들의 정보를 리턴
	
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();
		Student [] students = new Student[num];
		for (int i =0;i<num;i++) {
			Student s = new Student();
			System.out.println("이름을 입력하세요");
			s.name= sc.next();
			System.out.println("번호를 입력하세요");
			s.number = sc.nextInt();
			System.out.println("국어 점수를 입력하세요");
			s.kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요");
			s.eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요");
			s.math = sc.nextInt();
			students[i] = s;
			
		}
		return students;
	}

}
