package kr.or.ddit.homework.HomeWork16;

import java.util.Random;
import java.util.Scanner;

public class StageB extends Stage{

	@Override
	public int game(int result) {
		System.out.println("가위바위보 게임");
		int computer = new Random().nextInt(3);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("컴퓨터 : " + computer);
		System.out.print("사람 : ");
		int my = sc.nextInt();
		
		if (computer == 0) {
			if (my == 0 || my == 2) {
				System.out.println("졌습니다");
				result = 0;
			}
			else if (my == 1) {
				System.out.println("이겼습니다");
				result = 1;
			}
		}
		if (computer == 1) {
			if (my == 0 || my == 1) {
				System.out.println("졌습니다.");
				result = 0;
			}
			else if (my == 2) {
				System.out.println("이겼습니다");
				result = 1;
			}
		}
		if (computer == 2) {
			if (my == 0) {
				System.out.println("이겼습니다");
				result = 1;
			}
			else if (my == 1 || my == 2) {
				System.out.println("졌습니다.");
				result = 0;
			}
		}
		return result;
	}

	@Override
	public int gameMoney(int money, int result) {
		// 게임비 6000 보상 20000
		money -= 6000;
		if (result == 1) {
			money += 20000;
		}
		System.out.println(money);
		return money;
	}
}
