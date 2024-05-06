package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method7() {
		// 거스름돈을 입력 받아 화폐 단위별로 개수를 구하시오
		// ex) 77650 => 10000 7개, 5000 1개, 1000 2개, 500 1개, 100 1개, 50 1개
		
		int [] coin = {50000, 10000, 5000, 1000, 500, 100, 50};
		System.out.print("거스름돈을 입력하세요 : ");
		int money = sc.nextInt();
		
		for (int i = 0; i < coin.length; i++) {
			int result = money / coin[i];
			money %= coin[i];
			if (result == 0) continue;
			System.out.println(coin[i] + " " + result + "개");
		} 
		
		
	}
	
	public void method6() {
		int[] score = {80, 90, 87, 60, 94};
//		최댓값 구하기
//		int max = score[0];
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		} System.out.println("최대값은 : " + max);
		
//		최소값 구하기
//		int min = score[0];
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		} System.out.println("최소값은 : " + min);
	}
	
	public void method5() {
		int a = 10;
		int b = 7;
		
		// a 값과 b 값을 바꿔보기
		int c= a;
		a = b;
		b = c;
		
		System.out.println(" a : " + a + ", b : " + b);
	}
	
	
	public void method4() {
//		int a;
//		a = 10;
//		
//		int b = 10;
		
		int[] array = {1,2,3,4,5};	// 배열을 만들면서 값도 같이 만들어줌 (int b = 10;과 같은 방식)
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		// 역순으로 출력
		// sol 1
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		// sol 2
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[array.length-1-i]);
		}
	}
	
	
	public void method3() {
		// 크기 3짜리 배열을 만들고
		// 3개의 값을 입력해보시오
		// 배열 이름 : array
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void method2() {
		
		// int[] students = new int[5];
		// int[] 			<- 1차원 배열
		// students 		<- 배열이름 (변수)
		// new int [배열크기] <- 배열생성	
		// new : 힙영역에 새로운 공간을 만들어준다. -> 새로운 공간을 int 크기로 만들어준다. => 즉, 5개의 변수가 저장될 수 있는 공간이 생김
		
		int[] students = new int[5];
		students[0] = 100;
		students[1] = 89;
		students[2] = 77;
		students[3] = 95;
		students[4] = 64;
		
		int sum = 0;
		for (int i = 0; i<students.length; i++) {
			sum += students[i];
		}
		System.out.println(sum);
	}
	
	public void method1() {
		// 변수 5개를 만들고 각각에 0~100 사이의 값을 넣을 것
		int a1 = 100;
		int a2 = 89;
		int a3 = 77;
		int a4 = 95;
		int a5 = 64;
		
		// 총합 구하기
		int sum = a1 + a2 + a3 + a4 + a5;
		System.out.println(sum);
	}
}
