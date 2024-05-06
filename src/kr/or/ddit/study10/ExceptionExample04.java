package kr.or.ddit.study10;

import java.util.Scanner;

public class ExceptionExample04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionExample04 obj = new ExceptionExample04();
		obj.process();
	}

	public void process() {
		try {
			int sel = sc.nextInt();
			method1(sel);
			
		} catch (Exception e) {
			System.out.println("에러 발생");
		}
	}
	
	String[] names = {"홍길동", "이순신", "강감찬"};
	
	// 내가 처리할 수 없는 경우 -> throws
	// 호출한 곳에서 처리
	public void method1(int num) throws Exception {
		System.out.println(names[num]);
	}
}	
