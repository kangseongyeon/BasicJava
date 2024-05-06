package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType2 {	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType2 obj = new ReferenceType2();
		obj.process();
	}

	public void process() {
//		method1();
		method2();
	}
	
	
	public void method2() {
//		String a = "";		// heap 영역이 있지만, 값이 없음.
		String a = null; 	// 값이 heap 영역에 연결되지 않음. (값이 없다는 것이 아님)
		
//		if (a == null || a.isEmpty()) {
//			System.out.println("빈문자열");
//		}	// 빈 문자열 출력
		
		if (a.isEmpty() || a == null ) {
			System.out.println("빈문자열");
		}	
		// 오류 -> a.isEmpty() 오류 -> 연결되어 있지 않기 때문에 실행이 안됨
		
	}
	
	public void method1() {
		int a = 10;
		// 1 -> stack에 a=10 저장
		int b = 15;
		
		{
			// 2 -> stack에 b=15 저장
			String c = "test";
			// 3 -> heap 영역에 주소값 (ex.100) 생성 후 저장
		}
		// 4	-> 
		String d = "test";
		{
			int e = 4;
			// 5
			{
				int f = 10;
				// 6
			}
			int g = 3;
			// 7
			d = "test2";
			// 8
		}
	}
}
