package com.kr.first.obj2;

public class CarTest3 {

	public static void main(String[] args) {
		California cal1 = new California();
		Ferrari fer1 = new Ferrari();
		Car car1 = new Car("현대");
		
		System.out.println(cal1 instanceof Ferrari);
		
		
		/*
		drive(cal1);
		drive(fer1);
		drive(car1);
		*/
	}

	public static void drive(Car car) {
		car.drive();
		
	}
	
	

}
