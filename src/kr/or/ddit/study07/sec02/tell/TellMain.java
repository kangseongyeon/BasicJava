package kr.or.ddit.study07.sec02.tell;

import java.util.Scanner;

public class TellMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TellMain obj = new TellMain();
		obj.process();
	}

	public void process() {
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R : RoundRobn ");
		System.out.println("L : LeastJob ");
		System.out.println("P : PriortyAllocation");
		System.out.print("선택>>");

		Schedular sch = null;
		String select = sc.next();
		// equalsIgnoreCase : 대소문자 구분 안함
		if (select.equalsIgnoreCase("R"))
			sch = new RoundRobn();
		if (select.equalsIgnoreCase("L"))
			sch = new LeastJob();
		if (select.equalsIgnoreCase("P"))
			sch = new PriorityAllocation();

		sch.getNextCall();
		sch.sendCallToAgent();

	}
}
