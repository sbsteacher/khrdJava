package com.kr.first.blackjack;

public class Dealer extends Gamer {
	public Dealer() {
		super(3);
	}
		
	public void moreCard (CardDeck cd) {
		int sum = getSum();
		
		if(sum <= 16) {
			saveCard(cd.pick());
		}
	}
}
