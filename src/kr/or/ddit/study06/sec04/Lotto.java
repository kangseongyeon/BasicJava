package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto obj = new Lotto();
		obj.process();
	}

	public void process() {
//		int[][] paper = lottoPaper();
//		for (int i = 0; i < paper.length; i++) {
//			System.out.println(array2String(paper[i]));
//		}
		
		int[][][] bundle = lottoBundle (12000);
		printBundle(bundle);
	}

	public void printBundle(int[][][] bundle) {
		for (int[][] paper : bundle) {
			System.out.println("==================");
			for (int[] lotto : paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("==================");
		}
	}
	
//	public void printBundle (int[][][] bundle) {
//		for (int i = 0; i < bundle.length; i++) {
//			int[][] paper = bundle[i];
//			System.out.println("==================");
//			for (int j = 0; j < paper.length; j++) {
//				int[] lotto = paper[j];
//					System.out.println(array2String(lotto));
//				}
//				System.out.println("==================");
//		}
//	}
	
	public int[][][] lottoBundle(int money) {
		int papers = money / 5000;
		if (papers % 5000 != 0)
			papers++;
		int[][][] bundle = new int[papers][5][6];
		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if (money % 5000 != 0) {
			bundle[bundle.length - 1] = lottoPaper((money % 5000) / 1000);
		}
		return bundle;
	}

	// num에 5가 들어감
	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for (int P = 0; P < paper.length; P++) {
			paper[P] = generateLotto();
		}
		return paper;
	}

	// 기본일 때는 5줄짜리를 만든다
	public int[][] lottoPaper() {
		return lottoPaper(5);
	}

	public int[] generateLotto() {
		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			int ran = new Random().nextInt(45) + 1;
			lotto[i] = ran;
			// 중복 제거
			// 지금까지 입력한 값이랑 지금 뽑은 값이랑 비교 후, 같다면 i--
			for (int j = 0; j < i; j++) {
				if (lotto[j] == ran) {
					i--;
					break;
				}
			}
		}

		// 정렬
		Arrays.sort(lotto);
		return lotto;

//		System.out.println(Arrays.toString(lotto));
//		System.out.println(array2String(lotto));
	}

	public String array2String(int[] arr) {
		String result = "(";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i] + "";
			if (i != arr.length - 1) {
				result += ", ";
			}
		}
		result += ")";
		return result;
	}
}