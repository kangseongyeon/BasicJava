package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType3 obj = new ReferenceType3();
		obj.process();
	}

	public void process() {
		method1();
	}
	
	public void method1() {
		int a = 10;
		// 1 : 스택영역에 a=10 저장 
		{
			int b = 12;
			int[] c;
			// 2 : 스택영역에 b=12 저장 후, 스택에 c = null 
			c = new int[] {1,2,3};
			// 3 : 힙에 1,2,3을 담을 수 있는 공간(100)이 생김 -> 스택에 c 주소값 (100)이 담김 
		}
		// 4 : stack에 저장되어있는 b와 c가 사라짐 (but, heap의 주소값은 언제 사라질지 모름)
		String d = "test";
		// 5 : 힙에 test를 담을 수 있는 공간(200) 생김 -> 스택에 d 주소값 (200)이 담김
		{
			String[] e = new String [3];
			// 6 : 힙에 공간 3개가 생김 (300 ㅁ ㅁ ㅁ) -> 스택에 e 주소값 (300)이 담김
			e[0] = d;
			// 7 : 힙에 d 주소값 0번째 위치에 d가 담김 (300 : 200 ㅁ ㅁ)
			String f = "test2";
			// 8 : 힙에 test를 담을 수 있는 공간(400) 생김 -> 스택에 f 주소값 (400)이 담김
			e[1] = f;
			// 9 : 힙에 d 주소값 1번째 위치에 f가 담김 (300 : 200 400 ㅁ)
			e[2] = "test";
			// 10 : 힙에 d 주소값 2번째 위치에 test의 주소값이 담김 (300 : 200 400 200)
			
		}
	}
}
