package kr.or.ddit.study07.sec01;

import java.util.Scanner;

public class PhoneMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneMain obj = new PhoneMain();
		obj.process();
	}

	public void process() {
//		Phone phone = new Phone();
//		phone.tell();	// 전화 걸기
		
//		DmbPhone dmbPhone = new DmbPhone();
//		dmbPhone.tell(); // 전화 걸기
//		dmbPhone.dmb(); // 티비 시청
		
		IPhone iphone = new IPhone();
		iphone.camera();
		
		IPhone2 iphone2 = new IPhone2();
		iphone2.camera();
	}
}
