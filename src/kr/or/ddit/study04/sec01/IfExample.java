package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
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
		// 점수를 입력받고 학점을 출력하세요.
		// 90점 이상 A,
		// 80점 이상 B,
		// 70점 이상 C,
		// 60점 이상 D,
		// 60점 미만 F
		
		// 끝자리가 
		// 0~2 -
		// 3~6 0
		// 7~9 +
		
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();
		String grade = "";
		
		if (score == 100) {
			grade = "A+";
		}
		else if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}

		if (score > 60 && score != 100) {
			if (score % 10 <= 2) {
				grade += "-";
			}
			else if (score % 10 <= 6) {
				grade += "0";
			}
			else if (score % 10 <= 9) {
				grade += "+";
			}
		}
		System.out.println(grade);
	}
	
	
	public void method5() {
		// 키와 체중을 입력하여 BMI 지수를 구하고
		// BMI 지수에 따른 정상, 과체중, 비만, 고도비만 정보 출력
		// BMI 지수 = 체중(kg) / 키 (m) * 키
		
		// 0~18.4 		: 저체중
		// 18.5 ~ 22.9 	: 정상
		// 23.0~24.9 	: 과체중
		// 25.0 ~ 29.9 	: 비만
		// 30 이상 		: 고도비만
		
		System.out.print("몸무게를 입력하세요 : ");
		double kg = sc.nextDouble();
		System.out.print("키를 입력하세요 : ");
		double m = sc.nextDouble();

		// m 값이 100보다 크다면 100으로 나누기
		if (m > 100) {
			m /= 100;
		}

		double bmi = kg / m / m;
		System.out.println(bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
	
	
	public void method4() {
		// 월을 입력 받아 봄(3~5) 여름 (6~8) 가을 (9~11) 겨울 (12~2)을 출력하시오
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();

		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		}

	}

	
	public void method3() {
		// 점수를 입력받고 학점을 출력하세요.
		// 90점 이상 A,
		// 80점 이상 B,
		// 70점 이상 C,
		// 60점 이상 D,
		// 60점 미만 F
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	
	public void method2() {
		// 점수를 입력 받아 60점 이상이면 합격 아니면 불합격
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	
	public void method1() {
		if (false) {
			System.out.println("IF안 실행문");
		}
		System.out.println("IF밖 실행문");
	}
}
