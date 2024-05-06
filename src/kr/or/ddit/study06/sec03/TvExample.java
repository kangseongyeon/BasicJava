package kr.or.ddit.study06.sec03;

public class TvExample {
	public static void main(String[] args) {

		// 변수를 만들면서 값을 넣어줌
		int b = 10;
		// 클래스를 만들면서 데이터도 담아줌
		Tv tv1 = new Tv("LG", 60);
		System.out.println(tv1.company + ", " + tv1.size);
		
		
		// 변수름 만든 후, 값을 넣어줌
		int a;
		a = 10;
		// 1. 생성자 만듦
		Tv tv2 = new Tv();
		
		// 2. 데이터 나중에 담아줌
		tv2.company = "삼성";
		tv2.size = 65;
	}
}