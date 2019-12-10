package com.kr.first.obj;

public class TvTest2 {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.name = "삼성";
		Tv tv2 = new Tv();
		tv2.name = "LG";
		Tv tv3 = new Tv();
		Tv tv4 = new Tv();
		Tv tv5 = new Tv();
		Tv tv6 = new Tv();
		
		System.out.println("cnt : " + Tv.cnt);
		
		System.out.println(tv1);
		System.out.println(tv1.toString());
		
	}
}







