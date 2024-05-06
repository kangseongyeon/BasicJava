package kr.or.ddit.my;

import java.util.Scanner;

public class Mystudy {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Mystudy obj = new Mystudy();
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
		boolean run = true;
		int balance = 0;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------");
			System.out.print("선택> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("예금액> ");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
	}
	
	public void method5() {
		for (int i=1; i<5; i++) {
			for (int j=4; j>0; j--) {
				if (i<j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}
	}
	
	public void method4() {
		for (int i=1; i<5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
				if (j==i) {
					System.out.println();
				}
			}
		}
	}
	
	public void method3() {
		// 4x + 5y = 60의 모든 해를 구해라
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if ((4 * x + 5 * y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

	public void method2() {
		// 2개의 주사위를 던졌을 때, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈이 합이 5이면 멈춰라
		while (true) {
			int num1 = (int) (Math.random() * 6 )+ 1;
			int num2 = (int) (Math.random() * 6 )+ 1;
			System.out.println("("+ num1 + ", " + num2 + ")");
			
			if ((num1 + num2) == 5) {
				break;
			}
		}
	}
	
	public void method1() {
		// 1 ~ 100까지의 정수 중에서 3의 배수의 총합 구하기
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%3 == 0) 
			{
				sum += i;
			}
		}System.out.println("3의 배수의 합 : " + sum);
	}

}