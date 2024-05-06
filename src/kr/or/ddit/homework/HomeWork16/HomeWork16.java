package kr.or.ddit.homework.HomeWork16;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}

	public void process() {
		// Stage class 를 만들고 game(), gameMoney();
		// StageA, StageB, StageC에 상속
		
		// StageA 홀짝 게임 : 게임비 2000 보상 4000
		// StageB 가위바위보게임 : 게임비 6000 보상 20000
		// StageC 주사위 숫자 맞추기 게임 : 게임비 1만보상 100000
		
		int money = 10000;
		while (money < 200000) {
			System.out.println("1. Stage A");
			System.out.println("2. Stage B");
			System.out.println("3. Stage C");
			
			Stage stage = null;
			int sel = sc.nextInt();
			
			if (sel == 1 && money >= 2000) stage = new StageA();
			if (sel == 2 && money >= 6000) stage = new StageB();
			if (sel == 3 && money >= 10000) stage = new StageC();
			
			int result = 0;
			result = stage.game(result);
			stage.gameMoney(money, result);
		}
		System.out.println("게임이 끝났습니다.");
	}
}
