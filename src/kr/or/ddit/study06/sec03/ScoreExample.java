package kr.or.ddit.study06.sec03;

public class ScoreExample {
	public static void main(String[] args) {
		Score s1 = new Score(80,70,60);
		System.out.println(s1);
		
		Score s2 = new Score();
		s2.kor = 74;
		s2.eng = 67;
		s2.math = 81;
		s2.avg = (s2.kor + s2.eng + s2.math) / 3.0;
		System.out.println(s2);
	}
}
