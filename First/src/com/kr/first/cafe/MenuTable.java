package com.kr.first.cafe;

import java.util.ArrayList;
import java.util.List;

public class MenuTable {
	private List<MenuItem> list;
	
	public MenuTable() {
		list = new ArrayList();
		List<CoffeeVO> dbList = DBApi.getCoffeeList();
		
		for(CoffeeVO vo : dbList) {
			list.add(new MenuItem(vo.getNm(), vo.getPrice()));
		}
		
	}
	
	public void showMenus() {
		for(int i=0; i<list.size(); i++) {
			MenuItem mi = list.get(i);
			System.out.printf("%d. %s (%,d원)\n", i+1, mi.getNm(), mi.getPrice());
		}
	}
	
	public MenuItem choice(int menuNo) {
		if(menuNo <= 0 || menuNo > list.size()) {
			return null;
		}
		return list.get(menuNo - 1);
	}
}









