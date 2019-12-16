package com.kr.first.blackjack;

public class Rule {
	public static void whoIsWin(Dealer dealer, Gamer gamer) {
		//둘 다 21점 넘어가면 무승부
		//둘 다 점수가 같으면 무승부
		//둘 중 한명만 21점 넘어가면 안 넘어간 사람이 이김
		//둘 다 21점 안 넘었다면 21점에 가까운 사람이 이김(점수가 더 높은 사람이 이김)
		
		int dSum = dealer.getSum();
		int gSum = gamer.getSum();
		
		if((dSum > 21 && gSum > 21) || dSum == gSum) {
			System.out.println("무승부!!!");
		} else {			
			if(dSum > 21 || gSum > 21) { //둘 중 한명만 21점 넘은
				if(dSum > gSum) {
					System.out.println("게이머 승리");
				} else {
					System.out.println("딜러 승리");
				}
			} else { //둘다 21점 안 넘음
				if(dSum > gSum) {
					System.out.println("딜러 승리");
				} else {
					System.out.println("게이머 승리");
				}
			}
			
		}
		
		System.out.println("-- 게이머 --");
		gamer.open();
		
		System.out.println("-- 딜러 --");
		dealer.open();
	}
}











