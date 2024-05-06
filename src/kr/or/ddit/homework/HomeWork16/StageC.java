package kr.or.ddit.homework.HomeWork16;

import java.util.Random;
import java.util.Scanner;

public class StageC extends Stage{

	@Override
	public int game(int result) {
		System.out.println("주사위 숫자 맞추기 게임");
		int computer = new Random().nextInt(6) + 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터 : " + computer);
		System.out.print("사람 : ");
		int my = sc.nextInt();
		
		if (computer == my) {
			System.out.println("이겼습니다.");
			result = 1;
		} else {
			System.out.println("졌습니다");
			result = 0;
		}
		return result;
	}

	@Override
	public int gameMoney(int money, int result) {
		// 게임비 1만 보상 100000
		money -= 10000;
		if (result == 1) {
			money += 100000;
		}
		System.out.println(money);
		return money;
	}

}
