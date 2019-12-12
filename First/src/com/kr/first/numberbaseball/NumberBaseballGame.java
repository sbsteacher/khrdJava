package com.kr.first.numberbaseball;

public class NumberBaseballGame {
	
	private int[] rArr;
	private int[] myArr;
	
	public NumberBaseballGame(int gameLen) {		
		rArr = new int[gameLen];
		myArr = new int[gameLen];
	}
	
	private void setRandomArr() {
		//중복되지 않는 숫자 1~9를 배열 크기만큼 랜덤값을 넣어준다. 0, 1, 2
		int len = 0;
		while(len < rArr.length) {
			int r = (int)(Math.random() * 9) + 1;			
			for(int i=0; i<rArr.length; i++) {
				if(rArr[i] == 0) {
					len++;
					rArr[i] = r;
					break;
				} else if(rArr[i] == r) {
					break;
				}
			}
		}
		
		for(int i : rArr) {
			System.out.println(i);
		}
	}
	
	public void gameStart() {
		setRandomArr();
	}
}





