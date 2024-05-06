package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork15 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork15 obj = new HomeWork15();
		obj.process();
	}

	public void process() {
		Calendar cal = Calendar.getInstance();

		while (true) {
			cal.set(Calendar.DATE, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);

			int last = cal.getActualMaximum(Calendar.DATE);

			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);

			System.out.println("-----------------------" + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1)
					+ "월 -----------------------");
			System.out.println("<이전달 \t\t\t\t\t\t다음달>");
			System.out.println("일 \t 월 \t 화 \t 수\t 목\t 금\t 토 ");
			System.out.println("-------------------------------------------------------");

			// < 이번달 다음달>
			for (int i = 1; i < day; i++) {
				System.out.print("\t");
			}

			for (int i = 1; i <= last ; i++) {
				System.out.print(i + "\t");
				
				if (day % 7 == 0) {
					System.out.println();
				}
				day++;
			}
			System.out.println();
			
			

			String input = sc.next();
			if (input.equals(">")) {
				cal.add(Calendar.MONTH, 1);
			}
			if (input.equals("<")) {
				cal.add(Calendar.MONTH, -1);
			}
		}
	}
}
