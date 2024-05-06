package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample03 obj = new ArrayExample03();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}

	public void method5() {
		int[] arr = { 1, 4, 2, 3, 5 };
		
		// Arrays.toString -> 배열 안에 값을 다 꺼내줌
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public void method4() {
		String[] strList = { "a", "b", "c" };
		// 향상된 for문
//		for (int i = 0; i<strList.length; i++) {
//			String str = strList[i];
//			System.out.println(str);
//		}

		for (String str : strList) {
			System.out.println(str);
		}
	}

	public void method3() {
		int[][] arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[5];
		System.out.println(arr); // [[I@4554617c
		System.out.println(arr[0]); // [I@74a14482
		System.out.println(arr[1]); // [I@1540e19d
		System.out.println(arr[2]); // [I@677327b6
	}

	public void method2() {

		// 국영수
		// 홍길동, 강감찬, 이순신
		int[][] score = { { 80, 75, 87 }, { 88, 90, 91 }, { 77, 73, 65 } }; // 1차원 배열이 3개 들어있음

		// 홍길동에 국어 점수
		int hong_kor;
		System.out.println("홍길동 국어 점수 : " + score[0][0]);

		// 강감찬에 수학점수
		int kang_math;
		System.out.println("강감찬 수학 점수 : " + score[1][2]);
		// 이순신에 영어점수
		int lee_eng;
		System.out.println("이순신 영어 점수 : " + score[2][1]);
		// 홍길동에 총점
		int hong_sum = 0;

		for (int i = 0; i < score[0].length; i++) {
			hong_sum += score[0][i];
		}

		System.out.println("홍길동 총점 : " + hong_sum);

		// 국어 점수 총합
		int kor_sum = 0;

//		sol 1
		for (int i = 0; i < score.length; i++) {
			kor_sum += score[i][0];
		}
		System.out.println("국어 점수 총합 : " + kor_sum);

//		sol 2
		kor_sum = (score[0][0] + score[1][0] + score[2][0]);
		System.out.println("국어 점수 총합 : " + kor_sum);
	}

	public void method1() {
		int[][] arr = new int[3][5]; // 5칸짜리 배열이 3묶음 있다.

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				sol 1
//				int[] temp = arr[i];
//				System.out.print(temp[j] + " ");

//				sol 2
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
