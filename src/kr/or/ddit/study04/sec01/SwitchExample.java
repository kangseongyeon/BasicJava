package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();
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
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		String grade ="";
		
		switch (score / 10) {
		case 10:
			grade = "A+";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			grade = "F";
			break;
		default:
			System.out.println("점수를 초과했습니다.");
			break;
		}
		
		switch (score % 10) {
		case 0:
		case 1:
		case 2:
			grade += "-";
			break;
		case 3:
		case 4:
		case 5:
		case 6:
			grade += "0";
			break;
		case 7:
		case 8:
		case 9:
			grade += "+";
			break;
		}
		System.out.println(grade);
	}
	
	public void method4() {
		// 점수를 입력받고 학점을 출력하세요.
		// 90점 이상 A,
		// 80점 이상 B,
		// 70점 이상 C,
		// 60점 이상 D,
		// 60점 미만 F
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		int grade = score / 10;
		
		switch (grade) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println("F");
			break;
		default:
			System.out.println("점수를 초과했습니다.");
			break;
		}
		
	}
	
	
	public void method3() {
		// KOR, ENG, CHN => 각각 한국, 영국, 중국
		System.out.print("약자 입력 : ");
		String str = sc.next();
		
		switch (str) {
		case "KOR":
			System.out.println("한국");
			break;
		case "ENG":
			System.out.println("영국");
			break;
		case "CHN":
			System.out.println("중국");
			break;
		default:
			System.out.println("없습니다");
			break;
		}
	}
	
	
	public void method2() {
		// 월을 입력 받고 마지막 일을 출력하시오.
		// 1,3,5,7,8,10,12 => 끝나는 날짜 31일
		// 4,6,9,11 => 끝나는 날짜 30일
		// 2 => 끝나는 날짜 28일
		System.out.print("월을 입력하세요 : ");
		
		int month = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("끝나는 날짜가 30일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("끝나는 날짜가 31일입니다.");
			break;
		case 2:
			System.out.println("끝나는 날짜가 28일입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}

	
	public void method1() {
		int select = 1;
		switch (select) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		}
	}
}
