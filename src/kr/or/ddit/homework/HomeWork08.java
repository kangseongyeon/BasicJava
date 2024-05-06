package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	public void process() {
		String[] stuName = { "고현", "권협", "이준", "리오", "새별" };
		// 국 영 수 총점 평균 등수
		
		int[][] score = { { 80, 70, 63, 0, 0, 1 }, { 90, 85, 90, 0, 0, 1 }, { 90, 70, 75, 0, 0, 1 },
				{ 65, 75, 70, 0, 0, 1 }, { 77, 80, 70, 0, 0, 1 }, };

		int sum = 0;
		int avg = 0;

		// 1. 총점 평균 계산
		for (int i = 0; i < score.length; i++) {
			sum = score[i][0] + score[i][1] + score[i][2];
			avg = sum / 3;
			score[i][3] = sum;
			score[i][4] = avg;
		}

		// 2. 등수 구하기
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}


		// 3. 출력
		System.out.println("이름 \t 국 \t 영 \t 수 \t 총점 \t 평균 \t 등수");
		System.out.println("=======================================================");

		for (int i = 0; i < score.length; i++) {
			System.out.print(stuName[i] + ": \t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

		// 4. 정렬 후 출력하기
		// 버블정렬
		// 총점 기준으로 1차원 배열 전체를 바꿈
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1; j++) {
				if (score[j][5] > score[j + 1][5]) {
					int[] temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
					
					String chName = stuName[j];
					stuName[j] = stuName[j + 1];
					stuName[j + 1] = chName;
				}
			}
		}

		System.out.println("========================정렬===========================");
		System.out.println("이름 \t 국 \t 영 \t 수 \t 총점 \t 평균 \t 등수");
		System.out.println("=======================================================");

		for (int i = 0; i < score.length; i++) {
			System.out.print(stuName[i] + ": \t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
