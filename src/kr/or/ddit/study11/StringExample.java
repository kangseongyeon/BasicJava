package kr.or.ddit.study11;

import java.util.Scanner;

public class StringExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringExample obj = new StringExample();
		obj.process();
	}

	public void process() {
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		method7();
		method8();
		method9();
	}
	
	public void method9() {
		System.out.println("게속 하시겠습니까?(y/n)");
		String yn = sc.next();
		// equalsIgnoreCase : 대소문자 같다고 인식
		if (yn.equalsIgnoreCase("y")) {
			if (yn.equals("y")) {
				System.out.println("계속");
			} else if (yn.equals("n")) {
				System.out.println("종료 합니다");
			}
		}
	}

	public void method8() {
		String str = null;
		if (str == null || str.isEmpty()) {
			System.out.println("빈 문자열");
		}
	}
	
	public void method7() {
		String test = "문자열 test입니다.";
		// contains : 해당 문자열에 특정 문자가 포함되어 있는가?
		if (test.contains("test")) {
			System.out.println("test 문자가 포함되어 있다.");
		}
	}
	
	public void method6() {
		String str = "Book1.csv";
		// starsWith : 문자가 뭐로 시작하는가?
		if (str.startsWith ("Book1")) {
			System.out.println("Book1로 시작합니다.");
		}
		
		// endsWith : 문자가 뭐로 끝나는가?
		if (str.endsWith(".csv")) {
			System.out.println(".csv로 끝납니다");
		}
	}
	
	public void method5() {
		String str = "123456";
		// 문자열 자르기
		str = str.substring(2,3);
		System.out.println(str);	// 3
	}
	
	public void method4() {
		String str = "ooo 바보";
		// replace : 원본 테스트 -> 해당하는 테스트로 바꿔줌
		str = str.replace("바보", "**");
		System.out.println(str);
	}
	
	public void method3() {
		String space = " a  b  c  \n \n\r \r\n";
		System.out.println(space);	// a  b  c  
		// trim : 앞 뒤 공백 제거 & 줄바꿈도 제거
		space = space.trim();
		System.out.println(space);	//a  b  c
	}
	
	public void method2() {
		String test = "a, b, c";
		// , 기준으로 쪼갠 후, String[] tokens에 넣어줌
		String[] tokens = test.split(",");
		for (String token : tokens) {
			token = token.trim();
			System.out.print(token);	//abc
		}
	}
	
	public void method1() {
		String test = "abcd";
		
		// 대문자로 바꿔줌
		test = test.toUpperCase();
		System.out.println(test);	// ABCD
		
		// 소문자로 바꿔줌
		test = test.toLowerCase();
		System.out.println(test);	// abcd
	
		if (test.equals("abcd")) {
			System.out.println("같다");
		}  
	}
}
