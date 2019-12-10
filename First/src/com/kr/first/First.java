package com.kr.first;

public class First {
	public static void main(String[] args) {
		//sum(1, 2); //3
		
		//printStar(6);
		
		//printTriangleStar(5);
		printReverseTriStar(6);
	}
	
	private static void printReverseTriStar(int num) {
		for(int i=num; i>0; i--) {
			
			for(int z=1; z<=num; z++) {
				if(z < i) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void printTriangleStar(int num) {
		for(int i=10; i<num+10; i++) {
			
			for(int z=9; z<i; z++) {
				System.out.print("*");
			}
			System.out.println();			
		}
	}
	
	
	
	public static void printStar(int num) {
		for(int z=0; z<num; z++) {
			for(int i=0; i<num; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
}
