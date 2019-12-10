package com.kr.first.obj;

public class Tv extends Object {
	static String brand;
	static int cnt;
	String name;
	int currentChannel;
	int currentVolume;
	
	public Tv() {
		cnt++;
	}
	
	public void volumeUp() {
		currentVolume++;
	}
	
	public void volumeDown() {
		currentVolume--;
	}
	
	public void printBrand() {
		System.out.println(brand);
	}
		
	@Override
	public String toString() {
		return String.format("name: %s, cC: %d, cV: %d"
				, name, currentChannel, currentVolume);
	}
	
}
