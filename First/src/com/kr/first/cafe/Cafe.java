package com.kr.first.cafe;

public class Cafe {
	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer customer = new Customer();
		Barista barista1 = new Barista("알렉산더");
		Barista barista2 = new Barista("알레르토");
		
		MenuItem mi = customer.order(mt);
		if(mi == null) {
			System.out.println("주문 종료!");
			return;
		}
		
		System.out.printf("%s을(를) 선택하셨습니다.\n", mi.getNm());
		Coffee coffee = barista2.makeCoffee(mi);
		
	}
}






