package com.kr.first.blackjack;

public class Gamer {
	private final Card[] myCards;
	
	public Gamer() {
		myCards = new Card[49];
	}
	
	public Gamer(int cnt) {
		myCards = new Card[cnt];
	}
	
	public void saveCard(Card c) {
		for(int i=0; i<myCards.length; i++) {
			if(myCards[i] == null) {
				myCards[i] = c;
				break;
			}
		}
	}
	
	public int getSum() {
		int sum = 0;
		for(int i=0; i<myCards.length; i++) {
			if(myCards[i] != null) {
				sum += myCards[i].getPoint();
			} else {
				break;
			}
		}
		return sum;
	}
	
	public void open() {
		int sum = 0;
		for(int i=0; i<myCards.length; i++) {
			if(myCards[i] != null) {
				System.out.println(myCards[i]);
				sum += myCards[i].getPoint();	
			} else {
				break;
			}
			
		}
		System.out.printf("합계 : %d\n", sum);
	}
}










