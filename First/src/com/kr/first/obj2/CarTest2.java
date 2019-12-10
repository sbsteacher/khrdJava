package com.kr.first.obj2;

public class CarTest2 {

	public static void main(String[] args) {
		Car car1 = new Car("현대", "소나타");
		car1.drive();
		/*
		Ferrari fer1 = new Ferrari("페라리", "V2");
		fer1.drive();
		
		California cal1 = new California();
		cal1.drive(); //페라리, 캘리포니아!!!
		*/
		Car car2 = new Ferrari();
		car2.drive();
		
		
		Ferrari fer3 = (Ferrari)car2;
		fer3.stop();
		
		Car car3 = new California();
		car3.drive();
		
		Ferrari cal3 = (Ferrari)car3;
		cal3.stop();
		
		California cal5 = (California)cal3;		
		cal5.climb();
		
	}

	
}





