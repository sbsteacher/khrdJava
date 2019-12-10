package com.kr.first.inter;

public class Siba implements Dog, Cuterble {

	private String name;
	
	public Siba(String name) {
		this.name = name;
	}
	
	@Override
	public void bark() {
		System.out.printf("%s는 짖습니다!! 멍멍!\n", name);
	}

	@Override
	public void ang() {
		System.out.printf("%s는 애교를 부립니다.!!\n", name);
		
	}

}
