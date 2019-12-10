package com.kr.first.abst;

public class Siba extends Dog {

	public Siba(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.printf("%s는 시바시바 짖습니다.!", this.getName());
		
	}

}
