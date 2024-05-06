//package kr.or.ddit.homework;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Random;
//import java.util.Set;
//
//public class HomeWork18 {
//	public static void main(String[] args) {
//		HomeWork18 hw = new HomeWork18();
//		hw.process();
//	}
//
//	public void process() {
//		printHistoGram(10000);
//	}
//
//	// 주사위 한개
//	public int oneDice() {
//		Random ran = new Random();
//		return ran.nextInt(6) + 1;
//	}
//
//	public int twoDice() {
//		return oneDice() + oneDice();
//	}
//
//	public Map trialNtimes(int n) {
//		Map<Integer, Integer> resultMap = new HashMap();
//		for (int i = 0; i < n; i++)
//			resultMap.put(i, twoDice());
//		return resultMap;
//	}
//
//	public void printHistoGram(int num) {
//		Map<Integer, Integer> resultMap = trialNtimes(num);
//
//		// 각 시행 횟수의 % 만큼 출력하시오.
//
//		for (int i = 2; i <= 12; i++) {
//			System.out.print(i + "\t");
//			int count = 0;
//			for (int j = 0; j < num; j++) {
//				if (resultMap.get(j) == i) {
//					count++;
//					if (count % 100 == 0)  System.out.print("■");
//				}
//				System.out.println();
//			}
//		}
//	}
//}

package kr.or.ddit.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}

	public void process() {
		printHistoGram(10000);
	}

	// 주사위 한개
	public int oneDice() {

		return new Random().nextInt(6) + 1;
	}

	public int twoDice() {
		return oneDice() + oneDice();
	}

	public Map trialNtimes(int n) {
		Map<Integer, Integer> resultMap = new HashMap();
		for (int i = 0; i < n; i++) {
			int number = twoDice();
			int count = 1;
			if (resultMap.containsKey(number))
				count += resultMap.get(number);
			resultMap.put(number, count);
		}
		return resultMap;
	}

	public void printHistoGram(int num) {
		Map<Integer, Integer> resultMap = trialNtimes(num);
//		 가로
		for (int i = 2; i <= 12; i++) {
			int count = resultMap.get(i);
//			System.out.println(i + "\t" + count);
			System.out.print(i + "\t");
			for (int j = 0; j < count * 100 / num; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
//		세로
	      int max = 0;
	      for (int i = 2; i <= 12; i++) {
	         int count = resultMap.get(i);
	         if (count * 100 / num > max)
	            max = count * 100 / num;
	      }
	      for (int row = 0; row < max; row++) {
	         for (int i = 2; i <= 12; i++) {
	            int count = resultMap.get(i);
	            int per = count * 100 / num;
	            if (max - row - per > 0)
	               System.out.print("   ");
	            else
	               System.out.print("■  ");
	         }
	         System.out.println();
	      }
	      System.out.println("2  3  4  5  6  7  8  9  10 11 12");
	}
}
