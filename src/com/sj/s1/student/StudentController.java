package com.sj.s1.student;

import java.util.Scanner;

public class StudentController {
	StudentUtil su = new StudentUtil();
	StudentView sv = new StudentView();
	Student[] sts = null;
	Student st = new Student();
	Scanner sc = new Scanner(System.in);

	public void start() {
		boolean cheak = true;
		while (cheak) {

			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프로그램 종료");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				sts = su.makeStudents();
				break;
			case 2:
				if (sts != null) {
					sv.viewStudents(sts);
				} else {
					sv.viewMessage("학생정보가 없습니다");
				}
				break;
			case 3:
				if (sts != null) {
					Student st = su.search(sts);
					if (st != null) {
						sv.viewStudent(st);
					} else {
						sv.viewMessage("검색결과가 없습니다");
					}
				} else {
					sv.viewMessage("학생정보가 없습니다.");
				}
				break;
			default:
				cheak = false;
			}
		}
	}
}
