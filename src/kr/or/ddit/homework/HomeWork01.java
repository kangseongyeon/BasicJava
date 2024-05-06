package kr.or.ddit.homework;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {
		// 기준일로부터 ?년 ?일 ?시 ?분 ?초 지났습니다.
		
		Date date = new Date();
		long time = date.getTime();
		System.out.println(time);
		
		long year, day, hour, min, sec;
		
		year = time / 365 / 24 / 60 / 60 / 1000;
		
		time = time - (year * 365 * 24 * 60 * 60 * 1000);
		day = time / 24 / 60 / 60 / 1000;

		
		time = time - (day * 24 * 60 * 60 * 1000);
		hour = time / 60 / 60 / 1000;

		
		time = time - (hour * 60 * 1000);
		min = time /60 / 60 / 1000;

		
		time = time - (min * 60 * 1000);
		sec = time / 1000;

		
		System.out.println("기준일로부터 " + year + "년 " + day + "일 " + hour + "시 " + min + "분 " + sec + "초 지났습니다.");

	}
}
