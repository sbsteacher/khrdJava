package com.kr.first.algo;

public class CustomList {
	private String[] list;
	
	public CustomList() {
		init();
	}
	
	private void init() {
		list = new String[0];
	}
	
	public void add(String val) {
		int oldLen = list.length;
		String[] temp = new String[oldLen + 1];
		
		for(int i=0; i<list.length; i++) {
			temp[i] = list[i];
		}
				
		temp[oldLen] = val;
		list = temp;
	}
	
	public void printAll() {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]);
			if(list.length > i + 1) {
				System.out.print(", ");	
			}
		}
	}
	
	public void printAll2() {
		for(int i=0; i<list.length; i++) {
			if(i != 0) {
				System.out.print(", ");	
			}
			System.out.print(list[i]);
		}
	}
	
	public void removeLastOne() {
		String[] temp = new String[list.length - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}
	
}
