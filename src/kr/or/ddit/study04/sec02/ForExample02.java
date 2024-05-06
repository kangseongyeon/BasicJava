package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
	}
	
	public void method6() {
//		구구단 출력하기
		for (int i = 2; i <= 9; i++) {
			
			System.out.println("====" + i + "단=====");
			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i * j));
				System.out.printf("%d * %d = %d\n", i, j , (i*j));
			}
			System.out.println();
		}
	}
	
	public void method5() {
//		i, j = 30일 때부터 출력하지 않기
		END: // 사용자가 지정
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.println(i + ", " + j);
				if (i == 30 && j == 30)
					break END;	// END에 해당하는 반복문 종료 (= 라벨)
			}
		}
	}
	
	public void method4() {
		// i, j = 30일 때부터 출력하지 않기
		
		
		boolean flag = true;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (flag) {
					System.out.println(i + ", " + j);
				}
				if (i == 30 && j == 30)
					flag = false;
			}
		}
	}
	
	public void method3() {
		
		// break 문
		// 반복문을 종료한다
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch == 'o')
				break;
			System.out.print(ch);
		}
	}
	
	public void method2() {
		// 영어를 입력하고 모음을 제거하세요
		// abcde -> bcd
		System.out.print("영어를 입력하세요 : ");
		String text = sc.next();
		for (int i = 0; i < text.length(); i++) {
			char change = text.charAt(i);
			if (change == 'a' || change == 'e' || change == 'i' || change == 'o' || change == 'u')
				continue;
			System.out.print(change);
		}
	}
	
	public void method1() {
		// continue 문
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) continue;
			System.out.println(i);
		}
	}
}
