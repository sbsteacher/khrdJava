package com.kr.first.numberbaseball;

import java.util.Scanner;

public class NumberBaseballGame {
	
	private int[] rArr;
	private int[] myArr;
	private Scanner scan;
	
	public NumberBaseballGame(int gameLen) {
		scan = new Scanner(System.in);
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
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	
	private void inputValue() {
		myArr = new int[myArr.length];
		
		PARENT: for(int i=0; i<myArr.length; i++) {
			System.out.printf("숫자 (%d) :", (i+1));
			int no = Utils.parseStringToInt(scan.next(), 0);
			if(no > 0 && no < 10) {				
				for(int z=0; z<myArr.length; z++) {
					if(no == myArr[z]) {				
						i--;
						System.out.println("중복된 값이 있습니다!");
						continue PARENT;
					}
				}				
				myArr[i] = no;
				
			} else {
				i--;
				System.out.println("1~9 사이의 값을 입력해 주세요!");
			}			
		}
	}
	
	//전부다 strike return false;
	public boolean check() {
		boolean result = true;		
		int s = 0;
		int b = 0;
		for(int i=0; i<rArr.length; i++) {			
			for(int z=0; z<myArr.length; z++) {
				if(rArr[i] == myArr[z]) {					
					if(i == z) {
						s++;
					} else {
						b++;
					}
				}
			}
		}
		
		System.out.printf("S:%d, B:%d, O:%d\n", s, b, myArr.length - (s + b));
		
		if(s == myArr.length) {
			result = false;
		}
		return result;
	}
	
	
	public void gameStart() {
		setRandomArr();
		int cnt = 0;
		do {
			cnt++;
			inputValue();	
		} while(check());
		scan.close();
		System.out.println("게임 끝!!!!");
		System.out.printf("%d번에 성공!!", cnt);
	}
}





