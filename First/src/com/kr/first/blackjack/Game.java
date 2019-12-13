package com.kr.first.blackjack;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		
		gamer.saveCard(cd.pick());		
		dealer.saveCard(cd.pick());
		gamer.saveCard(cd.pick());
		dealer.saveCard(cd.pick());
		
		System.out.println("--- 게이머 --- ");
		gamer.open();
		
		System.out.println("--- 딜러 --- ");
		dealer.open();
		
		
	}

}
