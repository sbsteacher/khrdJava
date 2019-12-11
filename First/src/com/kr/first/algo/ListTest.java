package com.kr.first.algo;

public class ListTest {

	public static void main(String[] args) {
		CustomList list = new CustomList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");		
		list.add(1, "T");
		list.clear();
		
		String val = list.get(2);
		System.out.println(val);
		
		//a, T, b, c, d, e

	}

}
