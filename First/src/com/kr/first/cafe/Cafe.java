package com.kr.first.cafe;

public class Cafe {
	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		Customer customer = new Customer();
		
		MenuItem mi = customer.order(mt);
	}
}
