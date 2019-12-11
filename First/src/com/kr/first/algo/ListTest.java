package com.kr.first.algo;

public class ListTest {

	public static void main(String[] args) {
		CustomList list = new CustomList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.removeFirstOne();
		list.removeFirstOne();
		list.printAll2();
	

	}

}
