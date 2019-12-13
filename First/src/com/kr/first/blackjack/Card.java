package com.kr.first.blackjack;


//무늬, 숫자, 점수
//은닉화
//무늬, 숫자든 값이 한번 입력되면 변경이 될 수 없도록 해주셨으면 좋겠어요!
public class Card {
	private final String shape;
	private final String no;
	private final int point;
	
	public static final String[] SHAPES = {"스페이드", "하트", "클로버", "다이아몬드"};
	
	//bigIdx 0~3 (0:스페이드, 1:하트, 2:클로버, 3:다이아몬드)
	//smallIdx 1~13 (1: no-A, point-1, 2: no-2, point-2
	
	//.... (11: no-J, point-10, 12: no-Q, point-10, 13:no-K, point-10)
	public Card(int bigIdx, int smallIdx) {
		super();
		shape = SHAPES[bigIdx];
		
		if(smallIdx <= 10) {
			point = smallIdx;
			if(smallIdx == 1) {
				no = "A";
			} else {
				no = Integer.toString(smallIdx);
			}
			
		} else {
			point = 10;
			switch(smallIdx){
			case 11:
				no = "J";
				break;
			case 12:
				no = "Q";
				break;
			default:
				no = "K";
				break;
			}
		}
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s (%d)", shape, no, point);
	}
	
}



