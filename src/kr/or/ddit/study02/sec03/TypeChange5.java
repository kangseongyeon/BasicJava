package kr.or.ddit.study02.sec03;

public class TypeChange5 {
	public static void main(String[] args) {
		// 소수점 버림
		double d = 10.1231;
		System.out.println("원래 숫자 : " + d);
		
		int i1 = (int)(d * 10);
//		double d1 = (double)i1 / 10;
		double d1 = i1 / 10.0;

//		double d1 = (double)((int)(d * 10)) / 10;
		
		System.out.println("소수점 첫자리 출력 : " + d1);
		
//		int i2 = (int)(d * 100);
//		double d2 = (double) i2 / 100;
// 		double d2 = (double)((int)(d * 100)) / 100;
		double d2 = (int)(d * 100) / 100.0;
		System.out.println("소수점 둘째자리 출력 : " + d2);
	}
}
