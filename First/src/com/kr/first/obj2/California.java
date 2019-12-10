package com.kr.first.obj2;

public class California extends Ferrari {
	@Override
	public void drive() {
		System.out.printf("%s, %s\n", brand, name);
	}
	
	public void climb() {
		System.out.println("등판하다!!!");
	}
}
