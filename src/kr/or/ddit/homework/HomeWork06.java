package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();
	}

	public void process() {
		method1();
		method2();
		method3();
		method4();
	}

	public void method4() {
		// 양의 정수 n이 매개변수로 주어질 때
		// n이 홀수라면 n이하의 홀수인 모든 양의 정수 합
		// n = 5 -> 1 + 3 + 5 = 9
		// n이 짝수라면 n이하의 모든 짝수인 모든 양의 정수제곱의 합
		// n = 4 -> 2^2 + 4^4 = 20
		int n = (int) (Math.random() * 100) + 1;
		System.out.println("랜덤한 숫자 : " + n);

		int sum = 0;
		if (n % 2 != 0) {
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
		} else {
			for (int i = 2; i <= n; i += 2) {
				sum += i * i;
			}
		}
		System.out.println(sum);
	}

	public void method3() {
		// for문 2개를 이용해서 구구단 전체를 출력하세요
		// 스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단은 제외
//		System.out.print("단을 입력하세요: ");
//		int dan = sc.nextInt();
//
//		for (int i = 2; i <= 9; i++) {
//			if (i != dan) {
//				for (int j = 1; j <= 9; j++) {
//					System.out.print(i + " * " + j + " = " + (i * j) + "\t");
//				}
//				System.out.println();
//			}
//		}
		
		System.out.print("단을 입력하세요: ");
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (j == dan) continue;
				System.out.print(j + "*" + i + "=" + i * j + "\t"); 
			}
			System.out.println();
		}
	}

	public void method2() {
		// for문 2개를 이용해서 구구단 전체를 출력하세요.
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	public void method1() {
		// 스캐너를 통해 숫자를 입력 받고 해당 숫자에 해당하는 구구단을 출력하시오
		// 2단 ~ 9단 외 다른 단을 입력하면 "잘못 입력했습니다." 출력

//		System.out.print("단을 입력하세요 : ");
//		int dan = sc.nextInt();
//		while (true) {
//			if (dan >= 2 && dan <= 9) {
//				for (int i = 1; i <= 9; i++) {
//					System.out.printf("%d * %d = %d \n", dan, i, (dan * i));
//				}
//			} else {
//				System.out.println("잘못 입력했습니다.");
//			}
//			break;
//		}
		
		System.out.print("단을 입력하세요 : ");
		int num = sc.nextInt();
		if (num >=2 && num <=9) {
			for (int i=1; i<=9; i++) {
				System.out.println(num + "*"  + i + "=" + num*i);
			}			
		} else {
			System.out.println("2~9 숫자를 입력해주세요");
		}
	}
}