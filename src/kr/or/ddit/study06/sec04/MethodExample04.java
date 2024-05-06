package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class MethodExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MethodExample04 obj = new MethodExample04();
		obj.process();
	}

	public void process() {
		// 스캐너를 통해 a,b값을 입력받고
		// add 메소드를 수정하여 a+b 값을 리턴 받아 출력하시오
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		int add = add(a, b);
		System.out.println("a + b = " + add);
		
		int sub = sub(a, b);
		System.out.println("a - b = " + sub);
		
		int mul = mul(a, b);
		System.out.println("a * b = " + mul);
		
		double division = division(a, b);
		System.out.println("a / b = " + division);
		
	}

	public int add(int a, int b) {
		return a + b;
	}	
	
	public int sub(int a, int b) {
		return a - b;
	}	
	
	public int mul(int a, int b) {
		return a * b;
	}	
	
	public double division (int a, int b) {
		return (double) a / b;
	}	
}