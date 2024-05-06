package kr.or.ddit.study06.sec02;

public class ScoreExample {
	public static void main(String[] args) {
		// 2명의 score 객체를 생성하고
		// 국영수 값을 각각 넣으시오.
		
		Score score1 = new Score();
		score1.kor = 90;
		score1.math = 70;
		score1.eng = 84;
		
		score1.avg = (score1.kor + score1.math + score1.eng) / 3.0; 
		System.out.println("국어 점수 : " + score1.kor + "\t" + "수학 점수 : " + score1.math + "\t" + "영어 점수 : " + score1.eng + "\t" + "평균 : " + score1.avg);
		
		Score score2 = new Score();
		score2.kor = 86;
		score2.math = 60;
		score2.eng = 100;
		
		score2.avg = (score2.kor + score2.math + score2.eng) / 3.0; 
		System.out.println("국어 점수 : " + score2.kor + "\t" + "수학 점수 : " + score2.math + "\t" + "영어 점수 : " + score2.eng + "\t" + "평균 : " + score2.avg);
	}
}
