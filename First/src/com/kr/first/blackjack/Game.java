package com.kr.first.blackjack;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		
		gamer.saveCard(cd.pick());		
		dealer.saveCard(cd.pick());
		gamer.saveCard(cd.pick());
		dealer.saveCard(cd.pick());
		
		dealer.moreCard(cd);
		
		//카드를 계속 받을 수 있도록 내가 더 받기 싫을 때 까지!!!!
		Scanner scan = new Scanner(System.in);
		while(true) {
			gamer.open();
			System.out.print("카드를 더 받으시겠습니까? (y) :");
			if(!scan.next().equalsIgnoreCase("y")) {
				break;
			}
			gamer.saveCard(cd.pick());
		}
		scan.close();
		
		
		System.out.println("--- 게이머 --- ");
		gamer.open();
		
		System.out.println("--- 딜러 --- ");
		dealer.open();
	}

}
