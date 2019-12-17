package com.kr.first.cafe;

public class Barista {
	private String nm;
	
	public Barista(String nm) {
		this.nm = nm;
	}
	
	public String getNm() {
		return nm;
	}
	
	public Coffee makeCoffee(MenuItem mi) {
		System.out.printf("%s 바리스타가 %s를 내립니다.\n", nm, mi.getNm());
		return new Coffee(mi);
	}
}
