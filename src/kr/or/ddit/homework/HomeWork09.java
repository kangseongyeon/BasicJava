package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}

	public void process() {
		Score s1 = new Score();
		s1.name = "고현";
		s1.kor = 80;
		s1.eng = 70;
		s1.math = 63;
		
		Score s2 = new Score();
		s2.name = "권협";
		s2.kor = 90;
		s2.eng = 85;
		s2.math = 90;
		
		Score s3 = new Score();
		s3.name = "이준";
		s3.kor = 90;
		s3.eng = 70;
		s3.math = 75;
		
		Score s4 = new Score();
		s4.name = "라오";
		s4.kor = 65;
		s4.eng = 75;
		s4.math = 70;
		
		Score s5 = new Score();
		s5.name = "새별";
		s5.kor = 77;
		s5.eng = 80;
		s5.math = 70;

		Score[] scores = { s1, s2, s3, s4, s5 };
		
		// 1. 총점 / 평균
		for (int i = 0; i < scores.length; i++) {
		    scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math; 
		    scores[i].avg = scores[i].sum / 3; 
		}

		// 2. 등수 구하기
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j<scores.length; j++) {
				if (scores[i].sum < scores[j].sum)
					scores[i].rank++;
			}
		}
		
		// 3. 출력
		System.out.println("이름 \t 국 \t 영 \t 수 \t 총점 \t 평균 \t 등수");
		System.out.println("=======================================================");

		for (int i = 0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}

		// 4. 정렬
		for (int i = 0; i < scores.length - 1; i++) {
		    for (int j = 0; j < scores.length - 1 - i; j++) { 
		        if (scores[j].sum < scores[j + 1].sum) { 
		            Score temp = scores[j];
		            scores[j] = scores[j + 1];
		            scores[j + 1] = temp;
		        }
		    }
		}

		
		// 5. 출력
		System.out.println("========================정렬===========================");
		System.out.println("이름 \t 국 \t 영 \t 수 \t 총점 \t 평균 \t 등수");
		System.out.println("=======================================================");
		
		for (int i = 0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
	}
}

class Score {
	// 이름 국영수 총점 평균 등수 필드 생성
	String name;
	int kor, eng, math, sum;
	int rank = 1;
	
	double avg;

	// toString 만들기
	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng+ "\t" + math + "\t" +
				sum + "\t" + avg + "\t" + rank + "\t" ;
	}
}