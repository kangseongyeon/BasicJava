package kr.or.ddit.study02.sec04;

import java.util.Scanner; // Ctrl + Shift + O

public class ScanExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScanExample obj = new ScanExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		System.out.println("3자리 문자를 입력하세요");
		String word = sc.next();
		
		// String -> char
		char ch1 = word.charAt(0);
		char ch2 = word.charAt(1);
		char ch3 = word.charAt(2);
		
		System.out.println("1번째 문자 : " + ch1);
		System.out.println("2번째 문자 : " + ch2);
		System.out.println("3번째 문자 : " + ch3);
	}
	
	
	public void method4() {
		System.out.print("환전 달러를 입력하세요 : ");
		String dollor = sc.next();
		
		double exchangeRate = 1349.88;
		
		double won = (Double.parseDouble(dollor)) * exchangeRate;
		
		int result = (int)won / 10 * 10;
		
		System.out.println(dollor + "$는 " + result + "원 입니다");
	}
	
	
	public void method3() {
		// 숫자 2개를 입력 받아 두 수를 더하시요.
		System.out.print("숫자를 입력 하세요 : ");
		String num1 = sc.next();
		
		System.out.print("숫자를 입력 하세요 : ");
		String num2 = sc.next();
		
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		System.out.println(num1 + "+" + num2 + "=" + sum);
	}
	
	public void method2() {
		System.out.print("숫자를 입력하세요 : ");
		String input = sc.next();
		
		// input을 int로 바꾼 후 10을 더하세요
		int num = Integer.parseInt(input) + 10;
		System.out.print("입력한 값에 10을 더한 값 : " + num);
	}
	
	
	public void method1() {
		System.out.print("문자를 입력하세요 : ");
		String input = sc.next();
		System.out.println(" 입력 결과 값 : " + input);
	}
}
