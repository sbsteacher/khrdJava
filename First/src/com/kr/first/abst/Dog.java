package com.kr.first.abst;

public abstract class Dog {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
		
	public void sleep() {
		System.out.printf("%s는 쿨쿨 잔다...", name);
	}
	
	public abstract void bark();

}
