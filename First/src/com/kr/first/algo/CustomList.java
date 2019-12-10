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
		
		if(list.length > 0) {
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
		}		
		temp[oldLen] = val;
		list = temp;
	}
	
	public void printAll() {
		for(String val : list) {
			System.out.println(val);
		}
	}
	
}
