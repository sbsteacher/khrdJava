package com.kr.first.cafe;

import java.util.ArrayList;
import java.util.List;

public class MenuTable {
	private List<MenuItem> list;
	
	public MenuTable() {
		list = new ArrayList();
		list.add(new MenuItem("아메리카노", 1500));
		list.add(new MenuItem("카푸치노", 2000));
		list.add(new MenuItem("카라멜 마키아또", 2500));
		list.add(new MenuItem("에스프레소", 2500));
	}
	
	public void showMenus() {
		for(int i=0; i<list.size(); i++) {
			MenuItem mi = list.get(i);
			System.out.printf("%d. %s (%,d원)\n", i+1, mi.getNm(), mi.getPrice());
		}
	}
}









