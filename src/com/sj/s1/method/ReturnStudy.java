package com.sj.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {

	public void test1() {

		System.out.println("void는 리턴이 없을때");

	}

	public int test2() {
		Random random = new Random();
		int num = random.nextInt();
		System.out.println("Test2 :"+num);
		
		return num;

	}
	
	public String test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String a = sc.next();
		return a ;
	
	}
	
	
}
