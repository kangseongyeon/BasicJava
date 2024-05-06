package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample02 obj = new MethodExample02();
		obj.process();
	}

	public void process() {
		// 스캐너를 통해 a, b 값을 입력 받고
		// add 메소드를 수정하여 a+b 값을 출력하시오.
		System.out.print("a를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("b를 입력하세요 : ");
		int b = sc.nextInt();
		add(a, b);
		sub(a, b);
		mul(a, b);
		division(a, b);
	}

	public void add(int a, int b) {
		System.out.println("a + b = " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("a - b = " + (a - b));
	}
	
	public void mul (int a, int b) {
		System.out.println("a * b = " + (a * b));
	}
	
	public void division (int a, int b) {
		System.out.println("a / b = " + (a / b));
	}
}