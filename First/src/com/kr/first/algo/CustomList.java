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
		if(list.length == 0) return;
		
		String[] temp = new String[list.length - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = list[i];
		}
		list = temp;
	}
	
	public void removeFirstOne() {
		if(list.length == 0) return;
	
		String[] temp = new String[list.length - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = list[i+1];
		}
		list = temp;
	}
	
	public void remove(int idx) {
		if(list.length == 0) return;
		
		String[] temp = new String[list.length - 1];
		for(int i=0; i<temp.length; i++) {
			if(i < idx) {
				temp[i] = list[i];	
			} else {
				temp[i] = list[i+1];
			}
		}
		list = temp;
	}
	
	public void add(int idx, String val) {
		String[] temp = new String[list.length + 1];
		
		for(int i=0; i<temp.length;i++) {
			if(i < idx) {
				temp[i] = list[i];
				
			} else if(i == idx) {
				temp[i] = val;
				
			} else {
				temp[i] = list[i-1];
			}
		}
		list = temp;
	}
	
	public String get(int idx) {
		return list[idx];
	}
	
	public void clear() {
		list = new String[0];
	}
}




