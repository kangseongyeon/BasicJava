package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}

	public void process() {

//// 		sol 2		
//
//		int computer = new Random().nextInt(3);
//		int computer = new Random().nextInt(3);
//		System.out.println("컴퓨터 : " + computer);
//		System.out.print("사람 : ");
//		int my = sc.nextInt();
//
//		if (computer == 0) {
//			if (my == 0) {
//				System.out.println("컴퓨터 : 가위, 사람 : 가위, 결과 : 비겼다.");
//			} else if (my == 1) {
//
//				System.out.println("컴퓨터 : 가위, 사람 : 바위, 결과 : 이겼다.");
//			} else if (my == 2) {
//				System.out.println("컴퓨터 : 가위, 사람 : 보, 결과 : 졌다.");
//			}
//		}
//		if (computer == 1) {
//			if (my == 0) {
//				System.out.println("컴퓨터 : 바위, 사람 : 가위, 결과 : 졌다.");
//			} else if (my == 1) {
//				System.out.println("컴퓨터 : 바위, 사람 : 바위, 결과 : 비겼다.");
//			} else if (my == 2) {
//				System.out.println("컴퓨터 : 바위, 사람 : 보, 결과 : 이겼다.");
//			}
//		}
//		if (computer == 2) {
//			if (my == 0) {
//				System.out.println("컴퓨터 : 보, 사람 : 가위, 결과 : 이겼다.");
//			} else if (my == 1) {
//				System.out.println("컴퓨터 : 보, 사람 : 바위, 결과 : 졌다.");
//			} else if (my == 2) {
//				System.out.println("컴퓨터 : 보, 사람 : 보, 결과 : 비겼다.");
//			}
//		}

// 		sol 1)		
		int computer = new Random().nextInt(3);
		
		String result = "";
		String result2 = "";
		String result3 = "";
		System.out.println("컴퓨터 : " + computer);
		
		
		if (computer == 0 ) {
			result += "가위";
		}
		else if (computer == 1) {
			result += "바위";
		}
		else if (computer ==2) {
			result += "보";
		}

		System.out.print("사람 : ");
		int my = sc.nextInt();
		
		if (my == 0) {
			result2 += "가위";
		}
		else if (my == 1) {
			result2 += "바위";
		}
		else if (my ==2) {
			result2 += "보";
		}

		
		
		if ((computer == 0 && my ==1) || (computer == 1 && my == 2) || (computer == 2 && my ==0)) {
			result3 += "이겼다";
		}
		else if ((computer == 0 && my == 0) || (computer == 1 && my ==1) || (computer == 2 && my ==2)) {
			result3 += "비겼다";
		}
		else {
			result3 += "졌다";
		}
		
		
		System.out.print("컴퓨터 : " + result + ", 사람 : " + result2 + " -> " + result3);

	}
}
