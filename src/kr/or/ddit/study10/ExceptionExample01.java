package kr.or.ddit.study10;

import java.util.Scanner;

public class ExceptionExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample01 obj = new ExceptionExample01();
		obj.process();
	}

	public void process() {
		int a = 10;
//		int b = 0; // 0으로 나눌 수 없음
		int[] b = { 1, 2, 0 };
		try {
			System.out.println("출력");
			for (int i = -1; i < b.length; i++) {
				double result = a / b[i];
				System.out.println("결과 값 : " + result);
			}
			
			
		} catch (ArithmeticException e) { // 연산 에러만 잡음
			System.out.println("잘못된 숫자로 나왔습니다.");
		} catch (ArrayIndexOutOfBoundsException e) { // 에러를 잡아옴
			System.out.println("배열 범위가 벗어남"); 
		}catch (Exception e) { // 모든 에러의 최상위 부모
			e.printStackTrace();  
		}
		
		System.out.println("종료 되었습니다");
	}
}
