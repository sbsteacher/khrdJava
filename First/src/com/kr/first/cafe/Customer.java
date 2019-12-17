package com.kr.first.cafe;

import java.util.Scanner;

import com.kr.first.numberbaseball.Utils;

public class Customer {
	private Scanner scan; 
			
	public Customer() {
		scan = new Scanner(System.in);
	}
			
	public MenuItem order(MenuTable mt) {
		mt.showMenus();
		MenuItem mi = null;		
		do {
			System.out.print("메뉴를 선택해 주세요 (종료: 0) ");
			int menuNo = Utils.parseStringToInt(scan.next(), -5000);
			if(menuNo == -5000) {
				System.out.println("정수만 입력해 주세요");				
			} else if(menuNo == 0) {
				break;
			}
			
			mi = mt.choice(menuNo);
			if(mi == null) {
				System.out.println("커피를 제대로 선택해 주세요.");	
			}
			
		}while(mi == null);
		
		return mi;
	}
}





