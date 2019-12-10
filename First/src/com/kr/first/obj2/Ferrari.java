package com.kr.first.obj2;

public class Ferrari extends Car {
	public Ferrari() {
		super("페라리", "캘리포니아", 5000);
	}
	
	public Ferrari(String brand) {
		super(brand);
	}
	
	public Ferrari(String brand, String name) {
		super(brand, name);
	}
	
	@Override
	public void drive() {
		System.out.printf("%s brand car is %s drived\n", brand, name);
	}
		
	public void stop() {
		System.out.println("차가 멈춤!!");
	}
}








