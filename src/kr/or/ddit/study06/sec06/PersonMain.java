package kr.or.ddit.study06.sec06;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person p1 = new Person();
		p1.setName("이름");
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		p1.setAge(age);
	}
}
