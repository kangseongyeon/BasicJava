package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
		method11();
		
	}
	
	public void method11() {
		// for문을 이용해서 문자를 입력 받고 숫자를 제거하시오
		System.out.print("문자를 입력하세요 : ");
		String word = sc.next();
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch>='0' && ch <= '9') {
			} else {
				System.out.print(word.charAt(i));
			}
		}
	}
	
	
	public void method10() {
		// 영어를 입력하고 모음을 제거하시오.
		// abcde -> bcd
		// 모음 a e i o u

		System.out.print("영어를 입력하세요 : ");
		String word = sc.next();

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			} else {
				System.out.print(word.charAt(i));
			}
		}
	}

	public void method9() {
		System.out.print("단어를 역순으로 입력하세요. ");
		String word = sc.next();
//		sol 2
//		for (int i = 0; i < word.length(); i++) {
//			System.out.print(word.charAt(word.length() - 1 - i));
//		}

//		sol 1
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}

	public void method8() {
		System.out.print("단어를 입력하세요. : ");
		String word = sc.next();
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	public void method7() {
		// 숫자를 입력받고 1~ 해당 숫자까지의 총합
		System.out.print("숫자를 입력하세요. ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void method6() {
//		소문자를 입력 받고 해당 문자부터 ~ z를 츨력하세요.
		System.out.print("소문자를 입력하세요.");
		// 문자열 입력받기
		String s = sc.next();
// 		sol 2
		char ch = s.charAt(0);
		for (; ch <= 'z'; ch++) {
			System.out.print(ch);
		}

//		sol 1
//		 문자열 -> 문자
//		char text = s.charAt(0);
//		int change = (int)text + 32;
//		
//		// for 문 작성		
//		for (char i = text; i<='z'; i++) {
//			System.out.print(i);
//		}
	}

	public void method5() {
		// a~z까지 출력해보기
//		sol 3
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}

//		sol 2
//		for (int i='a'; i<='z'; i++) {
//			System.out.print((char)i);
//		}

//		sol 1
//		for (int i=97; i<=97 + 26; i++) {
//			System.out.print((char)i);
//		}
	}

	public void method4() {
//		1~10까지 짝수의 합을 구하시오
		int sum = 0;
//		sol 2
		for (int i = 2; i <= 10; i += 2) {
			sum += i;
		}

//		sol 1
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
		System.out.println("1~10까지의 짝수의 합 : " + sum);
	}

	public void method3() {
		// 1~10까지 홀수의 합을 구하시오
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1~10까지 홀수의 합 : " + sum);
	}

	public void method2() {
		// 5~10까지의 합을 구하시고
		int sum = 0;
		for (int i = 5; i <= 10; i++) {
			sum += i;
		}
		System.out.println("5~10까지의 합 : " + sum);
	}

	public void method1() {
		// 1~5까지의 합을 구하시오
		int i1 = 1;
		int i2 = 2;
		int i3 = 3;
		int i4 = 4;
		int i5 = 5;

		int sum = i1 + i2 + i3 + i4 + i5;
		System.out.println("1~5까지의 합 : " + sum);

		int sum2 = 0;
//		int i = 1 <= 초기화식 0 (처음 시작한 값을 적어준다)
//		i <= 5; <= 조건식 (조건을 만족할 때 계속 실행)
//		i++ <= 
//		for (int i = 1; i<=5; i++) {
		for (int i = 1; i <= 5; i++) {
			sum2 += i;
		}
		System.out.println("1~5까지의 합 : " + sum2);
	}
}
