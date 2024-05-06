package kr.or.ddit.homework.HomeWork16;

import java.util.Random;
import java.util.Scanner;

public class StageA extends Stage {

	@Override
	public int game(int result) {
		Scanner sc = new Scanner(System.in);

		System.out.println("홀짝 게임");
		int computer = new Random().nextInt(100);
		System.out.println(computer);

		System.out.print("홀(1)/짝(0)을 입력하세요 : ");
		int my = sc.nextInt();

		if (computer % 2 == 0) {
			if (my == 1) {
				System.out.println("졌습니다.");
				result = 0;
			}
			else if (my == 0) {
				System.out.println("이겼습니다.");
				result = 1;
			}
		} else {
			if (my == 1) {
				System.out.println("이겼습니다.");
				result = 1;
			}
			else if (my == 0) {
				System.out.println("졌습니다.");
				result = 0;
			}
		}
		return result;
	}

	@Override
	public int gameMoney(int money, int result) {
		// 게임비 2000 보상 4000
		money -= 2000;
		if (result == 1) {
			money += 4000;
		}
		System.out.println(money);
		return money;
	}
}
