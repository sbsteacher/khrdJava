package com.kr.first.algo;

public class SortTest {

	public static void main(String[] args) {
		int[] arr = {5, 8, 11, 9, 3, 30, 22, 10};
		bubbleSort(arr);
		print(arr);

	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {			
			for(int z=0; z<arr.length-i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;					
				}
			}
		}
	}
	
	
	public static void sort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {			
			for(int z=i+1; z<arr.length; z++) {				
				if(arr[i]>arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;					
				}
			}
		}
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
