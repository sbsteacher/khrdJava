package com.kr.first.inter;

public class InterAnimalTest {

	public static void main(String[] args) {
		Dog siba = new Siba("로미");
		Dog bulldog = new BullDog();
		Dog wellsi = new Wellsi();
		
		/*
		siba.bark();
		Cuterble cuter = (Cuterble)siba;
		cuter.ang();
		Siba siba2 = (Siba)siba;
		siba2.ang();
		
		bulldog.bark();
		
		*/
		callAng(bulldog);
		callAng(siba);
		callAng(wellsi);
	}	
	
	public static void callAng(Dog dog) {
		if(dog instanceof Cuterble) {
			((Cuterble)dog).ang();
		}
	}

}












