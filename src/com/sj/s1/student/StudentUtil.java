package com.sj.s1.student;

import java.util.Scanner;
//학생 객체를 생성하고 정보를 입력받는곳
public class StudentUtil {
	StudentView sv = new StudentView();

	
	public Student search(Student [] sts) {
		//검색할 학생의 번호를 입력
		//입력 받은 번호와 일치하는 학생을 찾아서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("출력받을 학생 번호를 입력하세요");
		int num = sc.nextInt();
		Student student = null;
		for(int i = 0; i<sts.length;i++) {		
			if(sts[i].number == num) {

				student = sts[i];
				break;
			} }
		if(student==null) {
				System.out.println("학생없음");			}
	
			
			return student;
		}		
	
	
	
	
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
		s.makeTotal();
		
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
			s.makeTotal();
			students[i] = s;
			
		}
		return students;
	}

}
