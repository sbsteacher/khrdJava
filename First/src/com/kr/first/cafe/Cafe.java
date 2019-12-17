package com.kr.first.cafe;

public class Cafe {
	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer customer = new Customer();
		
		MenuItem mi = customer.order(mt);
		if(mi == null) {
			System.out.println("주문 종료!");
			return;
		}
	}
}
