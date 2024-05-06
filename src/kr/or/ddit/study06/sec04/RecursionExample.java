package kr.or.ddit.study06.sec04;

import java.util.Date;
import java.util.Scanner;

public class RecursionExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		RecursionExample obj = new RecursionExample();
		obj.process();
	}

	public void process() {
//		method(5);

//		int add = add(5);
//		System.out.println(add);

//		long mul = mul(20);
//		System.out.println(mul);

		Date d1 = new Date();
		// 50 -> 26810ms (26s)
		// 100 -> 
//		long fibo = fibonacci(100);
		long fibo = fibo2(100);
		Date d2 = new Date();
		System.out.println(d2.getTime() - d1.getTime());
		System.out.println(fibo);
	}
	
	// 완료된 결과값을 넣어줌
	long[] fiboList = new long[3000];
	
	
	public long fibo2(int num) {
		if (num == 1)  return 1;
		if (num == 2)  return 2;
		if (fiboList[num] != 0) {
			return fiboList[num];
		}
		// 최초 연산 값
		long result = fibo2(num - 1) + fibo2(num - 2);
		fiboList[num] = result;
		return result;
	}
	// f7 => f6 f5 필요
	// f6 => f5 f4
	// f5 => f4 f3

	// 1 2 3 5 8 13 21
	// 1 + 2 => 3
	// 2 + 3 => 5
	public long fibonacci(int num) {
		if (num == 1)
			return 1;
		if (num == 2)
			return 2;
		return fibonacci(num - 1) + fibonacci(num - 2);
	}

	public long mul(int num) {
		if (num == 1)
			return 1;
		return num * mul(num - 1);
	}

	// 5 -> 5 + 4 + 3 + 2 + 1 결과값을 리턴하세요
	public int add(int num) {
		// retrun 1 : num이 1이 되면 재귀가 멈춰야 한다.
		// 재귀 호출을 멈추고, 재귀를 풀기 시작하는 종료 조건으로 작용합니다.
		if (num == 1)
			return 1;
		return num + add(num - 1);
	}

	public void method(int num) {
		System.out.print(num); // 543210
		if (num > 0) {
			method(num - 1);
		}
	}
}