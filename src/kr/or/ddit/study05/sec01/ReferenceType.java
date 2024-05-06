package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType obj = new ReferenceType();
		obj.process();
	}

	public void process() {
		int a = 10;
		int b = 11;
		String c = "abc"; // 참조타입 -> 힙 영역에 저장 됨 
		String d = "abc";
		
		method1();
	}
	
	public void method1() {
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동");
		String d = new String("강감찬");
		String e = new String("강감찬");
		
		//  == : 스택 영역에 있는 값 비교 
		// 참조타입 : 값이 힙영역에 저장 됨
		System.out.println(a==b);	// true
		System.out.println(a==c);	// false -> new : 새로운 힙 영역 생성 (a와 c의 주소값 다름)
		System.out.println(c==d);	
		System.out.println(d==e);	// false -> new : 새로운 힙 영역 생성 (d와 e의 주소값 다름)
		
		// String 주소 값이 아닌 값을 비교
		System.out.println(b.equals(c));	// true
	}
}
