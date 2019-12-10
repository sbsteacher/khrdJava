package com.kr.first.obj2;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("현대", "Sonata", 2000);
		Car car2 = new Car("현대"); //브랜드만 입력, (이름: "", cc:0)
		Car car3 = new Car("현대", "Sonata"); //브랜드, 이름만 입력, (cc : 0)
		
		
		car1.drive();
		Ferrari ferrari = new Ferrari();
		ferrari.drive();
		Ferrari ferrari2 = new Ferrari("람보르기니");
		
		ferrari2.drive(); 
		//페라리 brand car is 캘리포니아 drived.
		//"페라리", "캘리포니아", 5000
		
		/*
		System.out.println("ferrari : " + ferrari.getBrand());
		System.out.println("ferrari : " + ferrari.getName());
		System.out.println("ferrari : " + ferrari.getCc());
		*/
		
	}
}
