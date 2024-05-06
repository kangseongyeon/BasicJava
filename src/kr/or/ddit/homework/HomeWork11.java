package kr.or.ddit.homework;

import java.util.*;

public class HomeWork11 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork11 obj = new HomeWork11();
		obj.process();
	}

	public void process() {
		Deck deck = new Deck();
		deck.suffle();
		// 주석 처리 하기
//		deck.printCardList();

		// 내 카드랑 랜덤 카드랑 비교해서
		// 숫자가 높다면 이김
		Card myCard = deck.getCard(0);

		// 컴퓨터 카드 : 랜덤
		int randomCard = new Random().nextInt(51) + 1; 
		Card comCard = deck.getCard(randomCard);
		print (myCard, comCard);
	}

	public void print(Card my, Card com) {
		// 결과값 출력
		// 내카드 ♤1 컴퓨터 ◇5
		// 결과 : lose
		System.out.println("내 카드  " + my + "  컴퓨터 " + com);
		if (my.num > com.num) {
			System.out.println("이겼습니다");
		} else if (my.num < com.num) {
			System.out.println("졌습니다");
		} else {
			System.out.println("비겼습니다");
		}
	}
}

class Card {
	String type;
	int num;

	// 생성자 type, num 입력할 것
	public Card(String type, int num) {
		this.type = type;
		this.num = num;
	}

	public String toString() {
		// type ♡♤♧◇
		// num 1~13
		// 1 -> a 출력
		// 11 -> J, 12 -> Q, 13 -> K
		// ??에 알맞은 값을 채우기
		String result = type + num;
		if (num == 1)
			result = type + "A";
		if (num == 11)
			result = type + "J";
		if (num == 12)
			result = type + "Q";
		if (num == 13)
			result = type + "K";

		return result;
	}
}

class Deck {
	Card[] cardList;

	public Deck() {
		cardList = new Card[52];
		String[] type = { "♤", "◇", "♡", "♧" };
		int cnt = 0;
		for (String t : type) {
			for (int i = 1; i <= 13; i++) {
				// ??에 알맞은 값을 채우기
				cardList[cnt++] = new Card(t, i);
			}
		}
	}

	public void suffle() {
		// 카드 섞기
		for (int i = 0; i < 1000; i++) {
			int ran = new Random().nextInt(52);
			Card temp = cardList[0];
			cardList[0] = cardList[ran];
			cardList[ran] = temp;
		}
	}

	
	public void printCardList() {
		for (int i = 0; i < cardList.length; i++) {
			System.out.print(cardList[i] + "  ");
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public Card getCard(int ran) {
		return cardList[ran];
	}
}