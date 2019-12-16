package com.kr.first.cafe;

//은닉화, 커피명, 커피가격 저장 할 수 있음!
//한 번 값이 입력되면 수정할 수 없도록 작업요
public class MenuItem {
	private final String nm;
	private final int price;
	
	public MenuItem(String nm, int price) {
		super();
		this.nm = nm;
		this.price = price;
	}

	public String getNm() {
		return nm;
	}

	public int getPrice() {
		return price;
	}
}
