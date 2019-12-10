package com.kr.first.obj2;

public class Car {
	protected String brand;
	protected String name;
	private int cc;
	
	public Car(String brand) {
		this(brand, "디폴값", 0);
	}
	
	public Car(String brand, String name) {
		this(brand, name, 0);
	}
	
	public Car(String brand, String name, int cc) {		
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void drive() {
		System.out.printf("%s 브랜드의 %s가 달린다.\n", brand, name);
	}
}












