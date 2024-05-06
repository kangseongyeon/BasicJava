package kr.or.ddit.study11;

import java.util.Date;
import java.util.Scanner;

public class StringBufferTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringBufferTest obj = new StringBufferTest();
		obj.process();
	}

	public void process() {
		Date d1 = new Date();
//		method1(100000);
		method2(1000);
		Date d2 = new Date();
		System.out.println(d2.getTime() - d1.getTime());
	}
	
	
	// 매우 느려용
	public void method1(int num) {
		String str = "";
		for (int i = 1; i < num; i++) {
			str += "a";
		}
	}
	
	// 매우 빨라용
	// StringBuffer : 객체 생성 -> 데이터 담김 -> 객체가 하나만 만들어짐 => 속도 빠름
	public void method2 (int num) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(i);
		}
		// reverse : 글자가 반대로 뒤집힘
		// 9876543210
		sb.reverse();
		System.out.println(sb.toString());
	}
}
