package com.kr.first.blackjack;

public class CardDeck {
	private Card[] cardArr;
	
	public CardDeck() {
		cardArr = new Card[52];		
	
		int idx = 0;
		for(int i=0; i<Card.SHAPES.length; i++) {
			for(int z=1; z<=13; z++) {
				//cardArr[(13*i)+(z-1)] = new Card(i, z);
				cardArr[idx++] = new Card(i, z);
			}
		}	
		shuffle();
	}
	
	private void shuffle() {
		for(int i=0; i<cardArr.length; i++) {
			int rIdx = (int)(Math.random() * cardArr.length);			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[rIdx];
			cardArr[rIdx] = temp;
		}
	}
	
	public Card pick() {
		Card c = null;
		for(int i=0; i<cardArr.length; i++) {
			if(cardArr[i] != null) {
				c = cardArr[i];
				cardArr[i] = null;
				break;
			}
		}
		return c;
	}
	
	public void printAll() {
		for(Card c : cardArr) {
			System.out.println(c);
		}
	}
}










