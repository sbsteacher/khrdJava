package com.kr.first.obj;

public class TvTest {
	public static void main(String[] args) {
		//Tv객체화 하시고, Tv의 name 속성에 "삼성43인치"라고 저장을 해주세요.
		
		//int, long, float, double, boolean, char, short, byte
		/*
		System.out.printf("%s \n", (char)87);
		System.out.printf("%d \n", (int)'W');
		*/
		
		int currentChannel = 10;
		
		Tv tv = new Tv();		
		tv.currentChannel = 10;
		
		changeChannel(currentChannel);
		changeChannel(tv);
		
		System.out.println("currentChannel : " + currentChannel); //20, 10
		System.out.println("tv.currentChannel : " + tv.currentChannel); //20, 20
	}
	
	public static void changeChannel(int currentChannel) {
		currentChannel = 20;
	}
	
	public static void changeChannel(Tv tv) {
		tv.currentChannel = 20;
	}
}
